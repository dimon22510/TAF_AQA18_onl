package tests.api.Case;

import baseEntities.BaseApiTest;
import models.Case;
import models.Section;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CaseTest extends BaseApiTest {

    //    @Test
//    public void getCase() {
//        expectedCase = Case.builder()
//                .title("TC_Case_01")
//                .sectionId(1)
//                .templateId(2)
//                .typeId(9)
//                .priorityId(3)
//                .estimate("3m")
//                .build();
//
//        expectedCase.setId(caseAdapter.add(expectedCase)
//                .getId());
//        Case actualCase = caseAdapter.get(expectedCase.getId());
//
//        Assert.assertEquals(actualCase, expectedCase);
//    }
//
//    @Test(dependsOnMethods = "getCase")
//    public void updateCase() {
//        Case updatedCase = Case.builder()
//                .id(expectedCase.getId())
//                .title("TC_Case_02")
//                .sectionId(1)
//                .templateId(1)
//                .typeId(8)
//                .priorityId(2)
//                .estimate("5m")
//                .build();
//
//        Case actualCase = caseAdapter.update(updatedCase);
//
//        Assert.assertEquals(actualCase, updatedCase);
//    }
//
//    @Test(dependsOnMethods = "updateCase")
//    public void moveCasesToSection() {
//        int destinationSectionId = 2;
//        int destinationSuiteId = 1;
//        secondCase = Case.builder()
//                .title("TC_Case_02")
//                .sectionId(1)
//                .templateId(2)
//                .typeId(9)
//                .priorityId(3)
//                .estimate("4m")
//                .build();
//
//        secondCase.setId(caseAdapter.add(secondCase)
//                .getId());
//        List<Case> cases = List.of(expectedCase, secondCase);
//
//        caseAdapter.moveCasesToSection(destinationSectionId, destinationSuiteId, cases);
//    }
//
//    @Test(dependsOnMethods = "moveCasesToSection")
//    public void deleteCase() {
//        caseAdapter.delete(expectedCase.getId());
//    }

    @Test
    public void addSection() {
        projectId = projectAdapter.addProject();

//        expectedSection1 = Section.builder()
//                .name("TestSection")
//                .description("Test Description")
//                .suite_id(1)
//                .build();
//
//        expectedSection2 = Section.builder()
//                .name("TestSection2")
//                .description("Test Description2")
//                .suite_id(2)
//                .build();

        sectionId1 = sectionAdapter.addSection(projectId);
        sectionId2 = sectionAdapter.addSection(projectId);

    }

    @Test(dependsOnMethods = "addSection")
    public void addCase() {

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

    }

    @Test(dependsOnMethods = "moveCase")
    public void deleteCase() {
        caseAdapter.deleteCase(expectedCase.getId());
    }




}
