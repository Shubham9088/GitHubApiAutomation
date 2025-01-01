package org.GitHub.test.crud;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.GitHub.asserts.AssertAction;
import org.GitHub.base.BaseTest;
import org.GitHub.endpoints.APIConstants;
import org.GitHub.modules.PayloadManager;
import org.GitHub.modules.TestData;
import org.GitHub.pojos.UserDetails;
import org.GitHub.statuscode.StatusCode;
import org.testng.annotations.Test;

public class TestUserDetails extends BaseTest {

    @Description("Positive Test -- Get user details")
    @Test
    public void test_VerifyUserDetails() {
        requestSpec.basePath(APIConstants.getUserDetails);
        response = RestAssured.given(requestSpec)
                .get();

        UserDetails user= PayloadManager.userDetailsResponse(response.asString());
        AssertAction.verifyStatusCode(response, StatusCode.SUCCESS_CODE);
        AssertAction.verifyResponseField(user,TestData.userTesData());
    }

    @Description("Positive Test -- Get blocked user list")
    @Test
    public void test_VerifyBlockedUserList() {
        requestSpec.basePath(APIConstants.getAllBlockedUserList);
        response=RestAssured.given(requestSpec)
                .get();

        AssertAction.verifyStatusCode(response,StatusCode.SUCCESS_CODE);
    }

    @Description("Positive Test -- Check if user is blocked return 404 if user is not blocked and 204 if user is blocked")
    @Test
    public void test_VerifyUserIsBlocked(){
        requestSpec.basePath(APIConstants.checkUserIsBlocked)
                .pathParams("username","shchak")
                .log().all();

        response=RestAssured.given(requestSpec)
                .get();

        AssertAction.verifyStatusCode(response,StatusCode.NOT_FOUND_CODE);

    }

}
