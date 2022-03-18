package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<UserTO> users;
    @javax.validation.constraints.NotNull
    private Integer count;

    public UserSearchResultTO() {
    }

    public UserSearchResultTO(java.util.List<UserTO> users, Integer count) {
        this.users = users;
        this.count = count;
    }

    public java.util.List<UserTO> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<UserTO> users) {
        this.users = users;
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
        if (users != null) {
            joiner.add("users: " + GraphQLRequestSerializer.getEntry(users));
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

        private java.util.List<UserTO> users;
        private Integer count;

        public Builder() {
        }

        public Builder setUsers(java.util.List<UserTO> users) {
            this.users = users;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public UserSearchResultTO build() {
            return new UserSearchResultTO(users, count);
        }

    }
}
