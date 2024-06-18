package rest_assured.delete;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestFive {
    private final static String URL = "https://reqres.in/";

    @Test
    public void checkDelete() {
        given().when()
                .contentType(ContentType.JSON)
                .delete(URL + "api/users")
                .then().statusCode(204);

        given().when().contentType(ContentType.JSON).delete(URL + "api/users").then().log().body();
    }
}
