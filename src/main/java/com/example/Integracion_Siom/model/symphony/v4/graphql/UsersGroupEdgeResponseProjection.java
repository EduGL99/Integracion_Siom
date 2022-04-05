package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersGroupEdgeResponseProjection extends GraphQLResponseProjection {

    public UsersGroupEdgeResponseProjection() {
    }

    public UsersGroupEdgeResponseProjection node(UsersGroupResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UsersGroupEdgeResponseProjection node(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UsersGroupEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
