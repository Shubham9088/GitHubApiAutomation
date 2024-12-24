package org.GitHub.test.crud;

import io.restassured.RestAssured;
import org.GitHub.asserts.AssertAction;
import org.GitHub.base.BaseTest;
import org.GitHub.endpoints.APIConstants;
import org.GitHub.modules.PayloadManager;
import org.GitHub.modules.TestData;
import org.GitHub.pojos.UserDetails;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

public class TestUserDetails extends BaseTest {

    @Test
    public void test_VerifyUserDetails() {
        requestSpec.basePath(APIConstants.GetUserDetails);
        response = RestAssured.given(requestSpec)
                .when()
                .get();

        //Deseralizing the response
        UserDetails user= PayloadManager.userDetailsResponse(response.asString());
        AssertAction.verifyStatusCode(response, 200);
        AssertAction.verifyResponseField(user,TestData.userTesData());
    }


}
