package adapters;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Case;
import models.MoveCase;
import org.apache.http.HttpStatus;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class CaseAdapter extends BaseAdapter {

//    public Case add(Case testCase) {
//        return given()
//                .pathParam("section_id", testCase.getSectionId())
//                .body(testCase, ObjectMapperType.GSON)
//                .when()
//                .post(Endpoints.ADD_CASE)
//                .then()
//                .statusCode(HttpStatus.SC_OK)
//                .extract()
//                .as(Case.class, ObjectMapperType.GSON);
//    }
//
//    public Case get(int caseId) {
//        return given()
//                .pathParam("case_id", caseId)
//                .when()
//                .get(Endpoints.GET_CASE)
//                .then()
//                .statusCode(HttpStatus.SC_OK)
//                .extract()
//                .as(Case.class, ObjectMapperType.GSON);
//    }
//
//    public Case update(Case testCase) {
//        return given()
//                .pathParam("case_id", testCase.getId())
//                .body(testCase, ObjectMapperType.GSON)
//                .when()
//                .post(Endpoints.UPDATE_CASE)
//                .then()
//                .statusCode(HttpStatus.SC_OK)
//                .extract()
//                .as(Case.class, ObjectMapperType.GSON);
//    }
//
//    public void moveCasesToSection(int destinationSectionId, int destinationSuiteId, List<Case> cases) {
//        Map<String, Object> moveCasesToSectionBody = new HashMap<>();
//        moveCasesToSectionBody.put("suite_id", destinationSuiteId);
//        String caseIdsList = cases.stream()
//                .map((testCase) -> String.valueOf(testCase.getId()))
//                .collect(Collectors.joining(","));
//        moveCasesToSectionBody.put("case_ids", caseIdsList);
//
//        given()
//                .pathParam("section_id", destinationSectionId)
//                .body(moveCasesToSectionBody)
//                .when()
//                .post(Endpoints.MOVE_CASE_TO_SECTION)
//                .then()
//                .statusCode(HttpStatus.SC_OK);
//    }
//
//    public void delete(int caseId) {
//        given()
//                .pathParam("case_id", caseId)
//                .when()
//                .post(Endpoints.DELETE_CASE)
//                .then()
//                .statusCode(HttpStatus.SC_OK);
//    }

    public int addCase(int sectionId) {
        testCase = Case.builder()
                .title("Case Test Number 1")
                .sectionId(sectionId)
                .templateId(2)
                .typeId(6)
                .priorityId(2)
                .estimate("5")
                .build();

        return given()
                .pathParam("section_id", sectionId)
                .body(testCase, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.ADD_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .jsonPath()
                .getInt("id");
    }

    public Case getCase(int caseId) {
        return given()
                .pathParam("case_id", caseId)
                .when()
                .get(Endpoints.GET_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Case.class, ObjectMapperType.GSON);
    }

    public Case updateCase(Case caseTest){
        return given()
                .pathParam("case_id", caseTest.getId())
                .body(caseTest, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.UPDATE_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Case.class, ObjectMapperType.GSON);
    }

    public void moveCase(Case caseTest) {
        given()
                .pathParam("section_id", section1)
                .when()
                .post(Endpoints.MOVE_CASE_TO_SECTION)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract();
    }

    public void deleteCase(int caseId) {
        given()
                .pathParam("case_id", caseId)
                .when()
                .post(Endpoints.DELETE_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
