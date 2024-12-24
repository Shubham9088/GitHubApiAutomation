package org.GitHub.asserts;

import io.restassured.response.Response;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertAction {

    public static void verifyStatusCode(Response response, int expectedStatusCode) {
        assertThat(response.statusCode()).isEqualTo(expectedStatusCode);
    }

    public static void verifyResponseField(Object object, LinkedHashMap<String, Object> map){
        for(Map.Entry<String, Object> entry: map.entrySet()){
            String key = entry.getKey();
            Object expectedValue = entry.getValue();
            String method= "get" + key.substring(0,1).toUpperCase() + key.substring(1);
            try{
                Object actualValue = object.getClass().getMethod(method).invoke(object);
                System.out.println("actual value "+ actualValue);
                assertThat(actualValue).isEqualTo(expectedValue);
            }catch(NoSuchMethodException e){
                Assert.fail("No such method " + method);
            }catch(IllegalAccessException e){
                Assert.fail("No such method ");
            }catch(InvocationTargetException e){
                Assert.fail("No such method");
            }
        }
    }


}
