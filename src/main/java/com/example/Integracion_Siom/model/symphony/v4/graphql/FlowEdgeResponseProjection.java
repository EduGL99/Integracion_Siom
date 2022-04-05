package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowEdgeResponseProjection extends GraphQLResponseProjection {

    public FlowEdgeResponseProjection() {
    }

    public FlowEdgeResponseProjection node(FlowResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public FlowEdgeResponseProjection node(String alias, FlowResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public FlowEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public FlowEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
