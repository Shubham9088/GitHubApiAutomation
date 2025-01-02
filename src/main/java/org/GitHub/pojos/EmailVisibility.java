package org.GitHub.pojos;

import java.util.Objects;

public class EmailVisibility {

    private String visibility;

    @Override
    public int hashCode() {
        return Objects.hash(visibility);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        EmailVisibility that=(EmailVisibility) obj;
        return this.visibility.equals(that.visibility);
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

}
