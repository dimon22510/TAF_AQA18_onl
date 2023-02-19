package baseEntities;

import adapters.CaseAdapter;
import adapters.MilestoneAdapter;
import adapters.ProjectAdapter;
import adapters.SectionAdapter;
import configuration.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.Case;
import models.Milestone;
import models.MoveCase;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;

public class BaseApiTest {
    protected int projectId;
    protected int milestoneId;
    protected int sectionId1;
    protected int sectionId2;
    protected int caseId;
    protected MilestoneAdapter milestoneAdapter;
    protected ProjectAdapter projectAdapter;
    protected SectionAdapter sectionAdapter;
    protected CaseAdapter caseAdapter;
    protected Case expectedCase;
    protected Milestone expectedMilestone;
    protected MoveCase moveCase;

    @BeforeClass
    public void setupApi() {
        RestAssured.baseURI = ReadProperties.getUrl();

        RestAssured.requestSpecification = given()
                .auth().preemptive().basic(ReadProperties.username(), ReadProperties.password())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);


        milestoneAdapter = new MilestoneAdapter();
        projectAdapter = new ProjectAdapter();
        caseAdapter = new CaseAdapter();
        sectionAdapter = new SectionAdapter();
        moveCase = new MoveCase();
    }
}