package org.GitHub.modules;

import com.google.gson.Gson;
import org.GitHub.pojos.UserDetails;

public class PayloadManager {

    public static Gson gson;
    public static UserDetails userDetailsResponse(String jsonResponse) {
        gson = new Gson();
        UserDetails user= gson.fromJson(jsonResponse, UserDetails.class);
        return user;
    }

}
