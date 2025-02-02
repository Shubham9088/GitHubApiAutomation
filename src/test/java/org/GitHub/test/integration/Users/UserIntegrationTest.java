package org.GitHub.test.integration.Users;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.GitHub.asserts.AssertAction;
import org.GitHub.base.BaseTest;
import org.GitHub.endpoints.APIConstants;
import org.GitHub.expectedresults.StatusCode;
import org.GitHub.pathParams.PathParams;
import org.testng.annotations.Test;

public class UserIntegrationTest extends BaseTest {

    @Description("Positive Test -- Block user")
    @Test(priority = 1)
    public void test_BlockUser() {
        requestSpec.basePath(APIConstants.blockUser)
                .pathParams("username", PathParams.getUserNames()[1]);

        response= RestAssured.given(requestSpec)
                .put();

        AssertAction.verifyStatusCode(response, StatusCode.No_CONTENT_CODE);
    }

    @Description("Negative Test -- Block same user")
    @Test(priority = 2)
    public void test_BlockSameUser(){
        requestSpec.basePath(APIConstants.blockUser)
                .pathParams("username", PathParams.getUserNames()[1]);
        response=RestAssured.given(requestSpec)
                .put();

        AssertAction.verifyStatusCode(response,StatusCode.Unprocessable_ENTITY_CODE);
    }

    @Description("Positive Test -- Check if user is blocked return 404 if user is not blocked and 204 if user is blocked")
    @Test(priority = 3)
    public void test_VerifyUserIsBlocked(){
        requestSpec.basePath(APIConstants.blockUser)
                .pathParams("username", PathParams.getUserNames()[1]);

        response=RestAssured.given(requestSpec)
                .get();

        AssertAction.verifyStatusCode(response,StatusCode.No_CONTENT_CODE);
    }

    @Description("Positive Test -- Get blocked user list")
    @Test(priority = 4)
    public void test_VerifyBlockedUserList() {
        requestSpec.basePath(APIConstants.getAllBlockedUserList).log().all();
        response=RestAssured.given(requestSpec)
                .get();

        AssertAction.verifyStatusCode(response,StatusCode.SUCCESS_CODE);
    }

    @Description("Positive Test -- Unblock user")
    @Test(priority = 5)
    public void test_UnblockUser() {
        requestSpec.basePath(APIConstants.blockUser)
                .pathParams("username", PathParams.getUserNames()[1]);

        response=RestAssured.given(requestSpec)
                .delete();

        AssertAction.verifyStatusCode(response,StatusCode.No_CONTENT_CODE);
    }
}
