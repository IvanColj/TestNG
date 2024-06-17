package rest_assured.post;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestTwo {
    private final static String URL = "https://reqres.in/";

    @Test
    public void checkRegistration() {
        Create create = new Create("morpheus", "leader");

        Request request = given()
                .body(create)
                .when()
                .contentType(ContentType.JSON)
                .post(URL + "api/users")
                .then().log()
                .all()
                .extract()
                .as(Request.class);

        Assert.assertEquals(create.getJob(), request.getJob());
        Assert.assertEquals(create.getName(), request.getName());
    }
}
