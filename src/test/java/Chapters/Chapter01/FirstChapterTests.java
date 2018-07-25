package Chapters.Chapter01;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class FirstChapterTests {

    private static final String BASE_URL = "http://petstore.swagger.io/v2";

    // In this test, we are going to test a GET API and validate the Response
    @Test
    public void sendAGETRequestAndValidateResponse() {
        given()
                .queryParam("status", "sold") // Filtering the data based on
                .when()
                .get(BASE_URL + "/pet/findByStatus") // This will get the data from the given URL
                .then()
                .statusCode(200) // It verify the actual response code with the given code
                .body("[0].id", notNullValue()) // Checking whether value is Not_Null or not
                .body("[0].category.name", notNullValue())
                .body("[0].status", equalTo("sold")); // Checking status is equal to "sold"
    }

    // Here we testing the GET API, by passing the query parameters in the URL
    @Test
    public void sendAGETRequestByPassingQueryParameterInURL() {
        given()
                .when()
                .get(BASE_URL + "/pet/findByStatus?status=sold") // Passing query parameters in URL itself
                .then()
                .statusCode(200)
                .body("[0].id", notNullValue())
                .body("[0].category.name", notNullValue())
                .body("[0].status", equalTo("sold"));
    }

    // In this test we are going to extract single value from the response
    @Test
    public void sendAGETRequestAndRetrieveValueFromBody() {
        String status = given()
                .queryParam("status", "sold")
                .when()
                .get(BASE_URL + "/pet/findByStatus")
                .then()
                .extract()
                .path("[0].status"); // Extracting the value from JSON and returning it

        if (status == null)
            throw new RuntimeException("Status is Empty!!!");
    }

    // This test will store the entire Response into Response Object
    @Test
    public void sendAGETRequestAndStoreTheResponse() {
        Response response = given()
                .queryParam("status", "sold")
                .when()
                .get(BASE_URL + "/pet/findByStatus"); // Finally it returns the Response

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}