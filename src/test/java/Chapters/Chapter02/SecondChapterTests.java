package Chapters.Chapter02;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.ResourceHelper;

public class SecondChapterTests extends BaseTest {

    // Abstracting the code for more readability and maintainability
    @Test
    public void abstractingTheRequestForMaintenanceAndReadability() {
        Response response = ResourceHelper.get(propertiesReader.getEndPointUrl("get_animals"));
        Assert.assertEquals(response.getStatusCode(), 200);
    }

}
