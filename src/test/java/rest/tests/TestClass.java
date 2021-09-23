package rest.tests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import selenium.helpers.PropReader;

import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class TestClass {
    private static RequestSpecification spec;
    final static String url = "https://reqres.in/";
    static Properties apiUrlProperties;



    @BeforeAll
    public static void initSpec() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(url)
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
        apiUrlProperties = PropReader.readApiStrings();
    }

    @Test
    public void GetUsersListTest(){
                given()
                .spec(spec)
                .when()
                .get(apiUrlProperties.getProperty("user.list"),apiUrlProperties.getProperty("user.list.page.id"))
                .then()
                .statusCode(200)
                .assertThat()
                .body("page",equalTo(apiUrlProperties.getProperty("user.list.page.id")));
    }

    @Test
    public void GetSingleUserTest(){
        given()
                .spec(spec)
                .when()
                .get(apiUrlProperties.getProperty("user"), apiUrlProperties.getProperty("user.valid.id"))
                .then()
                .statusCode(200)
                .assertThat()
                .body("data.id",  equalTo(Integer.parseInt(apiUrlProperties.getProperty("user.valid.id"))),
                        "data.email", equalTo(apiUrlProperties.getProperty("user.valid.email")),
                        "data.first_name", equalTo(apiUrlProperties.getProperty("user.valid.firstname")),
                        "data.last_name", equalTo(apiUrlProperties.getProperty("user.valid.lastname")));
    }

    @Test
    public void GetUserNotFoundTest(){
        given()
                .spec(spec)
                .get(apiUrlProperties.getProperty("user"), apiUrlProperties.getProperty("user.invalid.id"))
                .then()
                .assertThat()
                .statusCode(404);

    }

    @Test
    public  void PostUser(){
                given()
                .spec(spec)
                        .body("{\n" +
                                "\"name\":\"morpheus\",\n" +
                                "\"job\":\"leader\"\n" +
                                "}"

                        )

               .when()
               .post(apiUrlProperties.getProperty("user.post"))
               .then()
               .assertThat()
               .statusCode(201);

    }

    @Test
    public void PostLogin(){
        given()
                .spec(spec)
                .body("{\n" +
                        "\"email\":\"eve.holt@reqres.in\",\n" +
                        "\"password\":\"cityslicka\"\n" +
                        "}")
                .when()
                .post(apiUrlProperties.getProperty("login"))
                .then()
                .assertThat()
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));
    }
}
