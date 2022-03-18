package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomerEdge
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerEdgeResponseProjection extends GraphQLResponseProjection {

    public CustomerEdgeResponseProjection() {
    }

    public CustomerEdgeResponseProjection node(CustomerResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CustomerEdgeResponseProjection node(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CustomerEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
