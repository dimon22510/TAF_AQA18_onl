package tests.db;

import baseEntities.BaseApiTest;
import models.Milestone;
import org.testng.annotations.Test;

public class MilestoneDBTest {

    public class MilestoneTest extends BaseApiTest {

        //Это CRUD тест, необходимо запускать весь класс, так как все тесты зависимы методом dependsOnMethods.
        //Так же я добавил удаление проекта чтобы не плодить проекты.
        //При запуске тестов, будет выводиться информация о создании проекта и создании milestone с их id-ишниками.

        @Test
        public void addMilestone() {
            projectId = projectAdapter.addProject();

            expectedMilestone = Milestone.builder()
                    .name("MilestoneByTest")
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

        @Test(dependsOnMethods = "deleteMilestone")
        public void deleteProject() {
            projectAdapter.deleteProject(projectId);
        }
    }
}
