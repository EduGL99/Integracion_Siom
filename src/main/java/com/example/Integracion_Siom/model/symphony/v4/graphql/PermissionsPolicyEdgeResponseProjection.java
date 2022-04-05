package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicyEdgeResponseProjection extends GraphQLResponseProjection {

    public PermissionsPolicyEdgeResponseProjection() {
    }

    public PermissionsPolicyEdgeResponseProjection node(PermissionsPolicyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PermissionsPolicyEdgeResponseProjection node(String alias, PermissionsPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PermissionsPolicyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
