package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersGroupConnectionResponseProjection extends GraphQLResponseProjection {

    public UsersGroupConnectionResponseProjection() {
    }

    public UsersGroupConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public UsersGroupConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public UsersGroupConnectionResponseProjection edges(UsersGroupEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public UsersGroupConnectionResponseProjection edges(String alias, UsersGroupEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public UsersGroupConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
