package tests.api.Case;

import baseEntities.BaseApiTest;
import models.Case;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


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


}
