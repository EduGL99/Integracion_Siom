package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicySearchResultResponseProjection extends GraphQLResponseProjection {

    public PermissionsPolicySearchResultResponseProjection() {
    }

    public PermissionsPolicySearchResultResponseProjection permissionsPolicies(PermissionsPolicyResponseProjection subProjection) {
        return permissionsPolicies(null, subProjection);
    }

    public PermissionsPolicySearchResultResponseProjection permissionsPolicies(String alias, PermissionsPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissionsPolicies").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicySearchResultResponseProjection count() {
        return count(null);
    }

    public PermissionsPolicySearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
