package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersGroupSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<UsersGroupTO> usersGroups;
    @javax.validation.constraints.NotNull
    private Integer count;

    public UsersGroupSearchResultTO() {
    }

    public UsersGroupSearchResultTO(java.util.List<UsersGroupTO> usersGroups, Integer count) {
        this.usersGroups = usersGroups;
        this.count = count;
    }

    public java.util.List<UsersGroupTO> getUsersGroups() {
        return usersGroups;
    }

    public void setUsersGroups(java.util.List<UsersGroupTO> usersGroups) {
        this.usersGroups = usersGroups;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (usersGroups != null) {
            joiner.add("usersGroups: " + GraphQLRequestSerializer.getEntry(usersGroups));
        }
        if (count != null) {
            joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private java.util.List<UsersGroupTO> usersGroups;
        private Integer count;

        public Builder() {
        }

        public Builder setUsersGroups(java.util.List<UsersGroupTO> usersGroups) {
            this.usersGroups = usersGroups;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public UsersGroupSearchResultTO build() {
            return new UsersGroupSearchResultTO(usersGroups, count);
        }

    }
}
