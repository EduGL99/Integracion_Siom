package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchNodeEdgeResponseProjection extends GraphQLResponseProjection {

    public SearchNodeEdgeResponseProjection() {
    }

    public SearchNodeEdgeResponseProjection node() {
        return node(null);
    }

    public SearchNodeEdgeResponseProjection node(String alias) {
        fields.add(new GraphQLResponseField("node").alias(alias));
        return this;
    }

    public SearchNodeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SearchNodeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
