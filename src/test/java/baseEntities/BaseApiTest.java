package baseEntities;

import adapters.CaseAdapter;
import adapters.MilestoneAdapter;
import adapters.ProjectAdapter;
import configuration.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.Case;
import models.Milestone;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;

public class BaseApiTest {
    protected int projectId;
    protected int milestoneId;
    protected MilestoneAdapter milestoneAdapter;
    protected ProjectAdapter projectAdapter;
    protected Milestone expectedMilestone;
    protected Case expectedCase;
    protected Case secondCase;
    protected CaseAdapter caseAdapter;


    @BeforeClass
    public void setupApi() {
        RestAssured.baseURI = ReadProperties.getUrl();

        RestAssured.requestSpecification = given()
                .auth().preemptive().basic(ReadProperties.username(), ReadProperties.password())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);

//        RestAssured.config = RestAssuredConfig.config()
//                .objectMapperConfig(new ObjectMapperConfig().gsonObjectMapperFactory(
//                        (cls, charset) -> {
//                            Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//                            return gson;
//                        }
//                ));

        milestoneAdapter = new MilestoneAdapter();
        projectAdapter = new ProjectAdapter();
        caseAdapter = new CaseAdapter();
    }
}