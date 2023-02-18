package adapters;

import io.restassured.mapper.ObjectMapperType;
import models.Section;
import org.apache.http.HttpStatus;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class SectionAdapter extends BaseAdapter {

    public int addSection( int projectId) {
        section1 = Section.builder()
                .name("TestSection")
                .description("Test Description")
                .suite_id(1)
                .build();

        section2 = Section.builder()
                .name("TestSection2")
                .description("Test Description2")
                .suite_id(2)
                .build();


            return given()
                    .pathParam("project_id", projectId)
                    .body(section1, ObjectMapperType.GSON)
                    .body(section2, ObjectMapperType.GSON)
                    .when()
                    .post(Endpoints.ADD_SECTION)
                    .then()
                    .log().body()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .jsonPath()
                    .getInt("id");
    }
}
