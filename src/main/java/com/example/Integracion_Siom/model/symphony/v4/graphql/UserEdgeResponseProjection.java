package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserEdgeResponseProjection extends GraphQLResponseProjection {

    public UserEdgeResponseProjection() {
    }

    public UserEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UserEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UserEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UserEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
