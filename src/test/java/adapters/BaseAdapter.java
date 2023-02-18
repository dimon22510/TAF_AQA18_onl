package adapters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Case;
import models.MoveCase;
import models.Project;
import models.Section;
import org.testng.annotations.BeforeTest;

public class BaseAdapter {
    protected int projectId;
    protected Project expectedProject;
    protected Case testCase;
    protected MoveCase moveCase;
    protected Section section1;
    protected Section section2;
    protected Gson gson;

    @BeforeTest
    public void setUpApi() {
        gson = new Gson();
        gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        moveCase = new MoveCase();
    }
}
