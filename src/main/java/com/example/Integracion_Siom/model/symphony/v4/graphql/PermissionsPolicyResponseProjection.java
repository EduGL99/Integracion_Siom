package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicyResponseProjection extends GraphQLResponseProjection {

    public PermissionsPolicyResponseProjection() {
    }

    public PermissionsPolicyResponseProjection id() {
        return id(null);
    }

    public PermissionsPolicyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection name() {
        return name(null);
    }

    public PermissionsPolicyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection description() {
        return description(null);
    }

    public PermissionsPolicyResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection isGlobal() {
        return isGlobal(null);
    }

    public PermissionsPolicyResponseProjection isGlobal(String alias) {
        fields.add(new GraphQLResponseField("isGlobal").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection policy() {
        return policy(null);
    }

    public PermissionsPolicyResponseProjection policy(String alias) {
        fields.add(new GraphQLResponseField("policy").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection groups(UsersGroupResponseProjection subProjection) {
        return groups(null, subProjection);
    }

    public PermissionsPolicyResponseProjection groups(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("groups").alias(alias).projection(subProjection));
        return this;
    }


}
