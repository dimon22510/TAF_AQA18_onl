package adapters;
import dbTables.MilestoneTable;
import io.restassured.mapper.ObjectMapperType;
import models.Milestone;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import services.DataBaseService;
import utils.Endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MilestoneAdapter {
    public int addMilestone(Milestone milestone, int projectId) {
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

    public void getMilestone(Milestone expectedMilestone, int milestoneId) {
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
    }

    public void deleteMilestone(int milestoneId) {
        given()
                .pathParam("milestone_id", milestoneId)
                .when()
                .post(Endpoints.DELETE_MILESTONE)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
