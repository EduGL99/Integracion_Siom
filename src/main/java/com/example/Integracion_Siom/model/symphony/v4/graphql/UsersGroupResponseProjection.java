package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersGroupResponseProjection extends GraphQLResponseProjection {

    public UsersGroupResponseProjection() {
    }

    public UsersGroupResponseProjection id() {
        return id(null);
    }

    public UsersGroupResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection name() {
        return name(null);
    }

    public UsersGroupResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection description() {
        return description(null);
    }

    public UsersGroupResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection status() {
        return status(null);
    }

    public UsersGroupResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection members(UserResponseProjection subProjection) {
        return members(null, subProjection);
    }

    public UsersGroupResponseProjection members(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupResponseProjection policies(PermissionsPolicyResponseProjection subProjection) {
        return policies(null, subProjection);
    }

    public UsersGroupResponseProjection policies(String alias, PermissionsPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("policies").alias(alias).projection(subProjection));
        return this;
    }


}
