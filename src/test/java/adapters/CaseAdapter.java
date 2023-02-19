package adapters;

import io.restassured.mapper.ObjectMapperType;
import models.Case;
import org.apache.http.HttpStatus;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class CaseAdapter extends BaseAdapter {
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
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Case.class, ObjectMapperType.GSON);
    }

    public Case updateCase(Case caseTest) {
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

    public void moveCase(int caseId, int suiteId, int sectionId) {
        given()
                .body(String.format("{\n" +
                                "  \"suite_id\" : %d,\n" +
                                "  \"case_ids\": [%d]\n" +
                                "}",

                        suiteId,
                        caseId
                ))
                .pathParam("section_id", sectionId)
                .when()
                .post(Endpoints.MOVE_CASE_TO_SECTION)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
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
