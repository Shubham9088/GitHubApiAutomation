package org.GitHub.pojos;

import java.util.Arrays;
import java.util.Objects;

public class AddEmail {
    private String email[];

    public void setEmail(String email[]) {
        this.email = email;
    }

    public String[] getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AddEmail)) return false;
        AddEmail addEmail = (AddEmail) o;
        return Objects.deepEquals(email, addEmail.email);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(email);
    }
}
