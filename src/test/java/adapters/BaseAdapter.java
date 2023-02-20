package adapters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Project;
import org.testng.annotations.BeforeTest;

public class BaseAdapter {
    protected Project expectedProject;
    protected int projectId;
    protected Gson gson;

    @BeforeTest
    public void setUpApi() {
        gson = new Gson();
        gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

    }
}
