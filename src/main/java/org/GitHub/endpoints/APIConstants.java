package org.GitHub.endpoints;

public class APIConstants {
    public static final String baseUrl = "https://api.github.com";
    public static final String getUserDetails ="/user";
    public static final String token=System.getProperty("token");
    public static final String invalidToken="Bear abc";
    public static final String getAllBlockedUserList="/user/blocks";
    public static final String checkUserIsBlocked="/user/blocks/{username}";
}
