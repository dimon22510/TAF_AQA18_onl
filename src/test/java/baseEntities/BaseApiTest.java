package baseEntities;

import adapters.MilestoneAdapter;
import configuration.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.Milestone;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public class BaseApiTest {
    protected int projectId;
    protected int milestoneId;
    protected MilestoneAdapter milestoneAdapter;
    protected Milestone expectedMilestone;


    @BeforeTest
    public void setUpApi() {
        RestAssured.baseURI = ReadProperties.getUrl();

        RestAssured.requestSpecification = given()
                .auth().preemptive().basic(ReadProperties.username(), ReadProperties.password())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);

        milestoneAdapter = new MilestoneAdapter();
    }



}
