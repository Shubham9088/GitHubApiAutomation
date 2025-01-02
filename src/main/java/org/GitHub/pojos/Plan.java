package org.GitHub.pojos;

import java.util.Objects;

public class Plan {
    private String name;
    private int space;
    private int collaborators;
    private int private_repos;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return collaborators == plan.collaborators && private_repos == plan.private_repos && Objects.equals(name, plan.name) && Objects.equals(space, plan.space);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, space, collaborators, private_repos);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrivate_repos() {
        return private_repos;
    }

    public void setPrivate_repos(int private_repos) {
        this.private_repos = private_repos;
    }

    public int getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
}
