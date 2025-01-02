package org.GitHub.pojos;

import java.util.Objects;

public class EmailDetails {
    private String email;
    private boolean primary;
    private boolean verified;
    private String visibility;

    public EmailDetails(String email, boolean primary, boolean verified, String visibility) {
        this.email = email;
        this.primary = primary;
        this.verified = verified;
        this.visibility = visibility;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, primary, verified, visibility);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj== null || getClass()!=obj.getClass()) {
            return false;
        }
        EmailDetails that=(EmailDetails) obj;
        return this.email.equals(that.getEmail()) && this.primary==that.isPrimary() && this.verified==that.isVerified() && this.visibility.equals(that.visibility);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

}
