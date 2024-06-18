package rest_assured.post;

import io.qameta.allure.Step;
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

        step1(create.getJob(), request.getJob());
        step2(create.getName(), request.getName());
    }

    @Step ("Step1")
    public void step1(String create_job, String request_job) {
        Assert.assertEquals(create_job, request_job);
    }

    @Step ("Step2")
    public void step2(String create_name, String request_name) {
        Assert.assertEquals(create_name, request_name);
    }
}
