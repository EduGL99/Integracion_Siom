package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private boolean isGlobal;
    @javax.validation.constraints.NotNull
    private SystemPolicyTO policy;
    @javax.validation.constraints.NotNull
    private java.util.List<UsersGroupTO> groups;

    public PermissionsPolicyTO() {
    }

    public PermissionsPolicyTO(String id, String name, String description, boolean isGlobal, SystemPolicyTO policy, java.util.List<UsersGroupTO> groups) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isGlobal = isGlobal;
        this.policy = policy;
        this.groups = groups;
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public SystemPolicyTO getPolicy() {
        return policy;
    }

    public void setPolicy(SystemPolicyTO policy) {
        this.policy = policy;
    }

    public java.util.List<UsersGroupTO> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<UsersGroupTO> groups) {
        this.groups = groups;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        joiner.add("isGlobal: " + GraphQLRequestSerializer.getEntry(isGlobal));
        if (policy != null) {
            joiner.add("policy: " + GraphQLRequestSerializer.getEntry(policy));
        }
        if (groups != null) {
            joiner.add("groups: " + GraphQLRequestSerializer.getEntry(groups));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private boolean isGlobal;
        private SystemPolicyTO policy;
        private java.util.List<UsersGroupTO> groups;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setIsGlobal(boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setPolicy(SystemPolicyTO policy) {
            this.policy = policy;
            return this;
        }

        public Builder setGroups(java.util.List<UsersGroupTO> groups) {
            this.groups = groups;
            return this;
        }


        public PermissionsPolicyTO build() {
            return new PermissionsPolicyTO(id, name, description, isGlobal, policy, groups);
        }

    }
}
