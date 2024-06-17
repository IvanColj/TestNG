package rest_assured.put;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestThree {
    private static final String URL = "https://reqres.in/";

    @Test
    public void updateData() {

        Update update = new Update("morpheus", "zion resident");

        Request request = given()
                .body(update)
                .when()
                .contentType(ContentType.JSON)
                .put(URL + "api/users/2")
                .then().log().all()
                .extract()
                .as(Request.class);

        Assert.assertEquals(update.getName(), request.getName());
        Assert.assertEquals(update.getJob(), request.getJob());
    }
}
