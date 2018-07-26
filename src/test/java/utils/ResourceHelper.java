package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ResourceHelper {

    public static Response get(String url) {
        return given().when().get(url);
    }

    public static Response create(String url, String json) {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .body(json)
                .post(url);
    }

}
