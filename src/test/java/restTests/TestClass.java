package restTests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class TestClass {
    private static RequestSpecification spec;
    final static String url = "https://reqres.in/";


    @BeforeAll
    public static void initSpec() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(url)
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }
    @Test
    public void GetUsersListTest(){
                given()
                .spec(spec)
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .assertThat()
                .body("page",equalTo(2));
    }

    @Test
    public void GetUserTest(){
        given()
                .spec(spec)
                .when()
                .get("api/users/2")
                .then()
                .statusCode(200)
                .assertThat()
                .body("data.id", equalTo(2));
    }

    @Test
    public void GetUserNotFoundTest(){
        given()
                .spec(spec)

                .get("api/users/23")
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
               .post("/api/users")
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
                .post("/api/login")
                .then()
                .assertThat()
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));
    }
}
