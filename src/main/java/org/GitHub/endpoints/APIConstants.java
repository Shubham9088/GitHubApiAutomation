package org.GitHub.endpoints;

public class APIConstants {
    public static final String baseUrl = "https://api.github.com";
    public static final String getUserDetails ="/user";
    public static final String token="Bearer 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";
    public static final String invalidToken="Bear abc";
    public static final String getAllBlockedUserList="/user/blocks";
    public static final String checkUserIsBlocked="/user/blocks/{username}";
}
