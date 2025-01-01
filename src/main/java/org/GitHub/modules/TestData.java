package org.GitHub.modules;

import io.qameta.allure.Link;
import org.GitHub.pojos.UserDetails;

import java.util.*;
import java.util.LinkedHashMap;

public class TestData {

    public static LinkedHashMap<String, Object> map;
    public static LinkedHashMap<String, Object> userTesData(){
        map = new LinkedHashMap<>();
        map.put("login", "Shubham9088");
        map.put("id", 46985699);
        map.put("public_repos", 4);
        map.put("name", "Shubham Chakole");
        map.put("location", "Pune");
        map.put("email",null);
        map.put("followers", 0);
        map.put("following", 1);
        return map;
    }
}
