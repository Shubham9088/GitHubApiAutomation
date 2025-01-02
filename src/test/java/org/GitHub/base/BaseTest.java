package org.GitHub.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.GitHub.endpoints.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public RequestSpecification requestSpec;
    public Response response;

    @BeforeMethod
    public void setUp() {
        requestSpec = RestAssured.given()
                .baseUri(APIConstants.baseUrl)
                .accept("application/vnd.github+json")
                .header("Authorization",APIConstants.token);
    }
}
