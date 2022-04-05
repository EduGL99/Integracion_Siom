package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicyConnectionResponseProjection extends GraphQLResponseProjection {

    public PermissionsPolicyConnectionResponseProjection() {
    }

    public PermissionsPolicyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PermissionsPolicyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PermissionsPolicyConnectionResponseProjection edges(PermissionsPolicyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PermissionsPolicyConnectionResponseProjection edges(String alias, PermissionsPolicyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PermissionsPolicyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
