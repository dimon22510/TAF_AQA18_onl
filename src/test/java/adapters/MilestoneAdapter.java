package adapters;
import dbTables.MilestoneTable;
import io.restassured.mapper.ObjectMapperType;
import models.Milestone;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.DataBaseService;
import utils.Endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MilestoneAdapter {
    private Milestone expectedMilestone;
    private MilestoneTable milestoneTable;

    Logger logger = LogManager.getLogger(MilestoneAdapter.class);

    public MilestoneAdapter(DataBaseService dbService) {
        milestoneTable = new MilestoneTable(dbService);
    }

    public int addMilestone(Milestone milestone, int projectId) {
        expectedMilestone = Milestone.builder()
                .name("MilestoneByStremous")
                .description("TestNumber1546")
                .dueOn(232)
                .references("TestByTest")
                .startOn(321)
                .completed(true)
                .build();

        milestoneTable.addMilestone(expectedMilestone);

        return given()
                .pathParam("project_id", projectId)
                .body(milestone, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.ADD_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("name", equalTo(milestone.getName()))
                .body("description", equalTo(milestone.getDescription()))
                .body("due_on", equalTo(milestone.getDueOn()))
                .body("start_on", equalTo(milestone.getStartOn()))
                .extract()
                .jsonPath()
                .getInt("id");
    }

    public void getMilestone(Milestone milestone,int milestoneId) {
        ResultSet rs = milestoneTable.getMilestoneById(milestoneId);

        given()
                .pathParam("milestone_id", milestoneId)
                .when()
                .get(Endpoints.GET_MILESTONE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("name", equalTo(expectedMilestone.getName()))
                .body("description", equalTo(expectedMilestone.getDescription()))
                .body("due_on", equalTo(expectedMilestone.getDueOn()))
                .body("start_on", equalTo(expectedMilestone.getStartOn()));

        try {
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int due_on = rs.getInt("due_on");
                String refs = rs.getString("refs");
                int start_on = rs.getInt("start_on");
                boolean is_completed = rs.getBoolean("is_completed");

                logger.info("MilestoneID: " +rs.getString("id"));
                logger.info("Name: " +rs.getString("name"));
                logger.info("Description: " +rs.getString("description"));
                logger.info("Due_on: " +rs.getString("due_on"));
                logger.info("Refs: " +rs.getString("refs"));
                logger.info("Start_on: " +rs.getString("start_on"));
                logger.info("Is_completed: " +rs.getString("is_completed"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateMilestone(Milestone milestone, int milestoneId) {
        given()
                .pathParam("milestone_id", milestoneId)
                .body(milestone, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.UPDATE_MILESTONE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("name", equalTo(milestone.getName()))
                .body("description", equalTo(milestone.getDescription()))
                .body("due_on", equalTo(milestone.getDueOn()))
                .body("start_on", equalTo(milestone.getStartOn()));

        milestoneTable.updateMilestone(milestone);
    }

    public void deleteMilestone(int milestoneId) {
        given()
                .pathParam("milestone_id", milestoneId)
                .when()
                .post(Endpoints.DELETE_MILESTONE)
                .then()
                .statusCode(HttpStatus.SC_OK);

        milestoneTable.deleteMilestone(milestoneId);
    }
}
