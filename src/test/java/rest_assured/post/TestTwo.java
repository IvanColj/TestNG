package rest_assured.post;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestTwo {
    private final static String URL = "https://reqres.in/";

    @Test
    public void checkRegistration() {
        Request request = new Request("morpheus", "leader");

        Create create = given()
                .body(request)
                .when()
                .contentType(ContentType.JSON)
                .post(URL + "api/users")
                .then().log()
                .all()
                .extract()
                .as(Create.class);

        Assert.assertEquals(request.getJob(), create.getJob());
        Assert.assertEquals(request.getName(), create.getName());
    }
}
