package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationCUDTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private LocationPermissionRuleTO create;
    @javax.validation.constraints.NotNull
    private LocationPermissionRuleTO update;
    @javax.validation.constraints.NotNull
    private LocationPermissionRuleTO delete;

    public LocationCUDTO() {
    }

    public LocationCUDTO(LocationPermissionRuleTO create, LocationPermissionRuleTO update, LocationPermissionRuleTO delete) {
        this.create = create;
        this.update = update;
        this.delete = delete;
    }

    public LocationPermissionRuleTO getCreate() {
        return create;
    }

    public void setCreate(LocationPermissionRuleTO create) {
        this.create = create;
    }

    public LocationPermissionRuleTO getUpdate() {
        return update;
    }

    public void setUpdate(LocationPermissionRuleTO update) {
        this.update = update;
    }

    public LocationPermissionRuleTO getDelete() {
        return delete;
    }

    public void setDelete(LocationPermissionRuleTO delete) {
        this.delete = delete;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (create != null) {
            joiner.add("create: " + GraphQLRequestSerializer.getEntry(create));
        }
        if (update != null) {
            joiner.add("update: " + GraphQLRequestSerializer.getEntry(update));
        }
        if (delete != null) {
            joiner.add("delete: " + GraphQLRequestSerializer.getEntry(delete));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private LocationPermissionRuleTO create;
        private LocationPermissionRuleTO update;
        private LocationPermissionRuleTO delete;

        public Builder() {
        }

        public Builder setCreate(LocationPermissionRuleTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(LocationPermissionRuleTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(LocationPermissionRuleTO delete) {
            this.delete = delete;
            return this;
        }


        public LocationCUDTO build() {
            return new LocationCUDTO(create, update, delete);
        }

    }
}
