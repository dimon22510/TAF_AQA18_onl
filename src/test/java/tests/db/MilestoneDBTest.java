package tests.db;

import baseEntities.BaseApiTest;
import dbTables.ProjectTable;
import models.Milestone;
import models.Project;
import org.testng.annotations.Test;

public class MilestoneDBTest extends BaseApiTest {

    @Test
    public void addProject() {
        ProjectTable projectTable = new ProjectTable(dbService);
        projectTable.dropTable();
        projectTable.createTable();
        projectTable.addProject(Project.builder()
                .name("TestProject123")
                .announcement("Step")
                .showAnnouncement(true)
                .type(1)
                .build());
    }


    @Test(dependsOnMethods = "addProject")
    public void addMilestone() {


            expectedMilestone = Milestone.builder()
                    .name("MilestoneByTest")
                    .description("TestNumber1")
                    .dueOn(12312)
                    .startOn(12332)
                    .build();

            milestoneId = milestoneAdapter.addMilestone(expectedMilestone, projectId);
    }
}
