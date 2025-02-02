package org.GitHub.test.integration.Users;
import io.restassured.RestAssured;
import io.qameta.allure.Description;
import net.bytebuddy.build.Plugin;
import org.GitHub.asserts.AssertAction;
import org.GitHub.expectedresults.StatusCode;
import org.testng.annotations.Test;
import org.GitHub.base.BaseTest;
import org.GitHub.endpoints.APIConstants;

public class FollowersIntegrationTest extends BaseTest {

    @Description("Positive Test -- List followers for a user")
    @Test(priority = 1)
    public void test_ListFollowersForUser() {
        requestSpec.basePath(APIConstants.listFollowers);
        response= RestAssured.given(requestSpec)
                .get();

        AssertAction.verifyStatusCode(response, StatusCode.SUCCESS_CODE);

    }

    @Description("Positive Test -- List following for a user")
    @Test(priority = 2)
    public void test_ListFollowingForUser() {
        requestSpec.basePath(APIConstants.listFollowing);
        response = RestAssured.given(requestSpec)
                .get();

        AssertAction.verifyStatusCode(response, StatusCode.SUCCESS_CODE);
    }

    @Description("Positive Test -- Follow user")
    @Test(priority = 3)
    public void test_FollowUser(){

    }
}
