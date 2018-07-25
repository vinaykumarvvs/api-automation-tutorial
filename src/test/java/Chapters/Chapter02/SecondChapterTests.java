package Chapters.Chapter02;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.ResourceHelper;

public class SecondChapterTests extends BaseTest {

    // Optimized way to send a Request and receive the Response
    @Test
    public void optimizedWayToSendReqAndReceiveResponse() {
        Response response = ResourceHelper.get(propertiesReader.getEndPointUrl("get_animals"));
        Assert.assertEquals(response.getStatusCode(), 200);
    }

}
