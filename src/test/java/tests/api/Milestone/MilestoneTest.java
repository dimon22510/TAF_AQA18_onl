package tests.api.Milestone;

import baseEntities.BaseApiTest;
import models.Milestone;
import org.apache.hc.core5.http.HttpStatus;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class MilestoneTest extends BaseApiTest {

    @Test
    public void addMilestone() {
        projectId = 43;

        expectedMilestone = Milestone.builder()
                .name("Positive_Milestone12345")
                .description("Test Milestone")
                .dueOn(123123)
                .startOn(1232432532)
                .build();

        milestoneId = milestoneAdapter.add(expectedMilestone, projectId);

    }

    @Test(dependsOnMethods = "addMilestone")
    public void getMilestone() {
        milestoneAdapter.get(milestoneId, expectedMilestone);
    }

    @Test(dependsOnMethods = "getMilestone")
    public void updateMilestone() {
        Milestone updateMilestone = Milestone.builder()
                .id(milestoneId)
                .name("Update Positive_Milestone54321")
                .description("Update Test Milestone")
                .dueOn(54321)
                .startOn(54555)
                .build();

        milestoneAdapter.update(updateMilestone);
    }

    @Test(dependsOnMethods = "updateMilestone")
    public void deleteMilestone() {
        milestoneAdapter.delete(milestoneId);
    }



}
