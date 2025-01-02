package org.GitHub.pathParams;

import org.GitHub.pojos.EmailDetails;

public class PathParams {

    private static final String emailVisibility[]={"private", "public"};
    private static final String userNames[]={"Shubham9088","TestUser-Automation"};

    public static String[] getEmailVisibility() {
        return emailVisibility;
    }

    public static String[] getUserNames() {
        return userNames;
    }

    public static EmailDetails getEmailDetails() {
        return new EmailDetails("shubhamchakole22@gmail.com",true,true,"private");
    }
}
