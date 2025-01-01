package org.GitHub.modules;

import com.google.gson.Gson;
import org.GitHub.pojos.UserDetails;

import java.util.List;

public class PayloadManager {

    public static Gson gson;

    public static UserDetails userDetailsResponse(String jsonResponse) {
        gson = new Gson();
        UserDetails user = gson.fromJson(jsonResponse, UserDetails.class);
        return user;
    }

    public static List<?> blockedUserList(String jsonResponse) {
        return gson.fromJson(jsonResponse, List.class);
    }

}
