package org.GitHub.test.crud;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.GitHub.asserts.AssertAction;
import org.GitHub.endpoints.APIConstants;
import org.GitHub.statuscode.StatusCode;
import org.testng.annotations.Test;
import org.GitHub.base.BaseTest;

public class InvalidToken extends BaseTest {

    @Description("Negative Test -- Get user details with invalid token")
    @Test
    public void test_VerifyUserDetails_InvalidToken() {
        requestSpec.header("Authorization", APIConstants.invalidToken)
                .basePath(APIConstants.getUserDetails);
        response = RestAssured.given(requestSpec)
                .when()
                .get();

        AssertAction.verifyStatusCode(response, StatusCode.UNAUTHORIZED_CODE);
    }

    @Description("Negative Test -- Get blocked user list with invalid token")
    @Test
    public void test_VerifyBlockedUserList_InvalidToken() {
        requestSpec.header("Authorization", APIConstants.invalidToken)
                .basePath(APIConstants.getAllBlockedUserList);
        response = RestAssured.given(requestSpec)
                .get();

        AssertAction.verifyStatusCode(response, StatusCode.UNAUTHORIZED_CODE);

    }
}
