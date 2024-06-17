package rest_assured.get;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.List;

public class TestOne {
    private final static String URL = "https://reqres.in/";
    @Test
    public void checkHashtagInColorTest(){
        List<ResourceData> colors = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/unknown")
                .then()
                .log().all()
                .extract()
                .body()
                .jsonPath()
                .getList("data", ResourceData.class);

        colors.forEach(item -> Assert.assertTrue(item.getColor().contains("#")));
        Assert.assertTrue(colors.stream().allMatch(item -> item.getId() + 1999 == item.getYear()));
    }
}
