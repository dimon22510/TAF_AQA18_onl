package baseEntities;

import adapters.MilestoneAdapter;
import adapters.ProjectAdapter;
import configuration.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.Milestone;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import services.DataBaseService;

import static io.restassured.RestAssured.given;

public class BaseApiTest {
    protected DataBaseService dbService;
    protected int projectId;
    protected int milestoneId;
    protected MilestoneAdapter milestoneAdapter;
    protected ProjectAdapter projectAdapter;
    protected Milestone expectedMilestone;

    @BeforeTest
    public void setUpApi() {
        RestAssured.baseURI = ReadProperties.getUrl();

        RestAssured.requestSpecification = given()
                .auth().preemptive().basic(ReadProperties.username(), ReadProperties.password())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);

        dbService = new DataBaseService();

        milestoneAdapter = new MilestoneAdapter();
//        projectAdapter = new ProjectAdapter(dbService);
    }
    @AfterTest
    public void tearDown() {
        dbService.closeConnection();
    }
}
