package org.GitHub.expectedresults;

import org.GitHub.pojos.UserDetails;
import org.GitHub.pojos.Plan;

public class UserDetailsExpectedResult {

    public static UserDetails getUserDetailsExpectedResult() {
        UserDetails userDetails = new UserDetails();
        userDetails.setLogin("Shubham9088");
        userDetails.setId(46985699);
        userDetails.setNode_id("MDQ6VXNlcjQ2OTg1Njk5");
        userDetails.setAvatar_url("https://avatars.githubusercontent.com/u/46985699?v=4");
        userDetails.setGravatar_id("");
        userDetails.setUrl("https://api.github.com/users/Shubham9088");
        userDetails.setHtml_url("https://github.com/Shubham9088");
        userDetails.setFollowers_url("https://api.github.com/users/Shubham9088/followers");
        userDetails.setFollowing_url("https://api.github.com/users/Shubham9088/following{/other_user}");
        userDetails.setGists_url("https://api.github.com/users/Shubham9088/gists{/gist_id}");
        userDetails.setStarred_url("https://api.github.com/users/Shubham9088/starred{/owner}{/repo}");
        userDetails.setSubscriptions_url("https://api.github.com/users/Shubham9088/subscriptions");
        userDetails.setOrganizations_url("https://api.github.com/users/Shubham9088/orgs");
        userDetails.setRepos_url("https://api.github.com/users/Shubham9088/repos");
        userDetails.setEvents_url("https://api.github.com/users/Shubham9088/events{/privacy}");
        userDetails.setReceived_events_url("https://api.github.com/users/Shubham9088/received_events");
        userDetails.setType("User");
        userDetails.setUser_view_type("public");
        userDetails.setSite_admin(false);
        userDetails.setName("Shubham Chakole");
        userDetails.setCompany(null);
        userDetails.setBlog("");
        userDetails.setLocation("Pune");
        userDetails.setEmail(null);
        userDetails.setHireable(null);
        userDetails.setBio(null);
        userDetails.setTwitter_username(null);
        userDetails.setNotification_email(null);
        userDetails.setPublic_repos(4);
        userDetails.setPublic_gists(0);
        userDetails.setFollowers(0);
        userDetails.setFollowing(1);
        userDetails.setCreated_at("2019-01-24T04:13:42Z");
        userDetails.setUpdated_at("2025-01-06T11:26:06Z");
        Plan plan=new Plan();
        plan.setName("free");
        plan.setSpace(976562499);
        plan.setCollaborators(0);
        plan.setPrivate_repos(10000);
        userDetails.setPlan(plan);
        return userDetails;
    }

}
