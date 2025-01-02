package org.GitHub.test.crud;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.GitHub.asserts.AssertAction;
import org.GitHub.base.BaseTest;
import org.GitHub.endpoints.APIConstants;
import org.GitHub.expectedresults.UserDetailsExpectedResult;
import org.GitHub.modules.PayloadManager;
import org.GitHub.pathParams.PathParams;
import org.GitHub.pojos.EmailDetails;
import org.GitHub.pojos.UserDetails;
import org.GitHub.expectedresults.StatusCode;
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
        AssertAction.verifyResponseObject(user, UserDetailsExpectedResult.getUserDetailsExpectedResult());
    }

    @Description("Positive Test -- update primary email visibility")
    @Test
    public void test_PrimaryEmailVisibility() {
        requestSpec.basePath(APIConstants.emailVisibility)
                .body(PayloadManager.sendEmailVisibilityPayload());
        response=RestAssured.given(requestSpec)
                .patch();

        AssertAction.verifyStatusCode(response,StatusCode.SUCCESS_CODE);
    }

    @Description("Positive Test -- Get email addresses of authenticated user")
    @Test
    public void test_GetEmailAddresses() {
        requestSpec.basePath(APIConstants.getEmailAddress);
        response=RestAssured.given(requestSpec)
                .get();

        EmailDetails[] email=PayloadManager.listEmailDetails(response.asString());
        AssertAction.verifyStatusCode(response,StatusCode.SUCCESS_CODE);
        AssertAction.verifyResponseObject(email[0], PathParams.getEmailDetails());
    }
}
