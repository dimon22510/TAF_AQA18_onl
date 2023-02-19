package tests.api.Case;

import baseEntities.BaseApiTest;
import models.Case;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaseTest extends BaseApiTest {

//    Это CRUD тест. Необходимо запускать весь класс, так как все тесты зависимы методом dependsOnMethods.
//    Я добавил в этот тест добавление кейса, а так же удаление проекта чтобы не плодить проекты в testRail.
//    При запуске тестов, будет выводиться информация о создании проекта и создании тест кейса с их id-ишниками.

    @Test
    public void addCase() {
        projectId = projectAdapter.addProject();

        sectionId1 = sectionAdapter.addSection1(projectId);

        expectedCase = Case.builder()
                .title("Case Test Number 1")
                .sectionId(sectionId1)
                .templateId(2)
                .typeId(6)
                .priorityId(2)
                .estimate("5")
                .build();

        caseId = caseAdapter.addCase(sectionId1);
    }

    @Test(dependsOnMethods = "addCase")
    public void getCase() {
        expectedCase = Case.builder()
                .title("Case Test Number 1")
                .sectionId(sectionId1)
                .templateId(2)
                .typeId(6)
                .priorityId(2)
                .estimate("5m")
                .build();

        expectedCase.setId(caseId);

        Case actualCase = caseAdapter.getCase(caseId);

        Assert.assertEquals(actualCase, expectedCase);
    }

    @Test(dependsOnMethods = "getCase")
    public void updateCase() {
        sectionId2 = sectionAdapter.addSection2(projectId);

        Case updatedCase = Case.builder()
                .title("Update Case Test Number 2")
                .sectionId(sectionId1)
                .templateId(1)
                .typeId(1)
                .priorityId(1)
                .estimate("10m")
                .build();

        updatedCase.setId(caseId);

        Case actualCase = caseAdapter.updateCase(updatedCase);

        Assert.assertEquals(actualCase, updatedCase);
    }

    @Test(dependsOnMethods = "updateCase")
    public void moveCase() {
        moveCase.setSuiteId(1);
        caseAdapter.moveCase(caseId, moveCase.getSuiteId(), sectionId2);
    }

    @Test(dependsOnMethods = "moveCase")
    public void deleteCase() {
        caseAdapter.deleteCase(expectedCase.getId());
    }

    @Test(dependsOnMethods = "deleteCase")
    public void deleteProject() {
        projectAdapter.deleteProject(projectId);
    }
}
