package Chapters.Chapter01;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class FirstTest {

    private static final String BASE_URL = "http://petstore.swagger.io/v2";

    @Test
    public void sendAGETRequestAndValidateResponse() {
        given()
                .queryParam("status", "sold")
                .when()
                .get(BASE_URL + "/pet/findByStatus")
                .then()
                .statusCode(200)
                .body("[0].id", notNullValue())
                .body("[0].category.name", notNullValue())
                .body("[0].status", equalTo("sold"));
    }

    @Test
    public void sendAGETRequestAndRetrieveValueFromBody() {
        String status = given()
                .queryParam("status", "sold")
                .when()
                .get(BASE_URL + "/pet/findByStatus")
                .then()
                .extract()
                .path("[0].status");

        if (status == null)
            throw new RuntimeException("Status is Empty!!!");
    }

    @Test
    public void sendAGETRequestAndStoreTheResponse() {
        Response response = given()
                .queryParam("status", "sold")
                .when()
                .get(BASE_URL + "/pet/findByStatus");

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}