package rest_assured.patch;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestFour {
    private static final String URL = "https://reqres.in/";

    @Test
    public void testPatchUpdate() {
        Create create = new Create("morpheus", "zion resident");

        Answer answer = given()
                .body(create)
                .when()
                .contentType(ContentType.JSON)
                .patch(URL + "api/users/2")
                .then().log().body()
                .extract()
                .as(Answer.class);

        Assert.assertEquals(create.getName(), answer.getName());
        Assert.assertEquals(create.getJob(), answer.getJob());
    }
}
