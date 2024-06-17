package rest_assured.delete;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestFive {
    private final static String URL = "https://reqres.in/";

    public int StatusCode;

    @Test
    public void checkDelete() {
        StatusCode = given()
                .when()
                .contentType(ContentType.JSON)
                .delete(URL + "api/users")
                .getStatusCode();

        given().when().contentType(ContentType.JSON).delete(URL + "api/users").then().log().body();
        Assert.assertEquals(204, StatusCode);
    }
}
