package org.GitHub.endpoints;

public class APIConstants {
    public static final String baseUrl = "https://api.github.com";
    public static final String getUserDetails ="/user";
    public static final String token=System.getProperty("token");
    public static final String invalidToken="Bear abc";
    public static final String getAllBlockedUserList="/user/blocks";
    public static final String blockUser ="/user/blocks/{username}";
    public static final String emailVisibility="/user/email/visibility";
    public static final String getEmailAddress="/user/emails";
    public static final String listFollowers="/user/followers";
    public static final String listFollowing="/user/following";
}
