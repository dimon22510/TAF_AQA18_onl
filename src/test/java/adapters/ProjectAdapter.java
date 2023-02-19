package adapters;

import io.restassured.mapper.ObjectMapperType;
import models.Project;
import org.apache.http.HttpStatus;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class ProjectAdapter extends BaseAdapter {

    public int addProject() {
        expectedProject = new Project();
        expectedProject.setName("ProjectByTest");
        expectedProject.setAnnouncement("This is a description");
        expectedProject.setType(1);
        expectedProject.setShowAnnouncement(true);

        return projectId = given()
                .body(expectedProject, ObjectMapperType.GSON)
                .when()
                .post(Endpoints.ADD_PROJECT)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .jsonPath()
                .getInt("id");
    }

    public void deleteProject(int projectId) {
        given()
                .pathParam("project_id", projectId)
                .when()
                .post(Endpoints.DELETE_PROJECT)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
