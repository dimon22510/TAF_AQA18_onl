package tests.api.Milestone;

import baseEntities.BaseApiTest;
import models.Milestone;
import org.testng.annotations.Test;


public class MilestoneTest extends BaseApiTest {
    @Test
    public void addMilestone() {
        projectId = projectAdapter.addProject();

        expectedMilestone = Milestone.builder()
                .name("MilestoneByStremous")
                .description("TestNumber1")
                .dueOn(12312)
                .startOn(12332)
                .build();

        milestoneId = milestoneAdapter.addMilestone(expectedMilestone, projectId);
    }

    @Test(dependsOnMethods = "addMilestone")
    public void getMilestone() {
        milestoneAdapter.getMilestone(expectedMilestone, milestoneId);
    }

    @Test(dependsOnMethods = "getMilestone")
    public void updateMilestone() {
        Milestone updateMilestone = Milestone.builder()
                .name("MilestoneUpdateByStremous")
                .description("New Update")
                .dueOn(132000)
                .startOn(571999)
                .references("Lol kek")
                .build();

        milestoneAdapter.updateMilestone(updateMilestone, milestoneId);
    }

    @Test(dependsOnMethods = "updateMilestone")
    public void deleteMilestone() {
        milestoneAdapter.deleteMilestone(milestoneId);
    }
}
