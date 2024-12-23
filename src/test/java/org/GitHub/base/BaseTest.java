package org.GitHub.base;

import com.beust.ah.A;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.GitHub.endpoints.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

    public RequestSpecification requestSpec;
    public Response response;

    @BeforeTest
    public void setUp() {
        requestSpec = RestAssured.given()
                .baseUri(APIConstants.BASE_URL)
                .accept("application/vnd.github+json")
                .header("Authorization",APIConstants.token);
    }
}
