package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowInstanceEdgeResponseProjection extends GraphQLResponseProjection {

    public FlowInstanceEdgeResponseProjection() {
    }

    public FlowInstanceEdgeResponseProjection node(FlowInstanceResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public FlowInstanceEdgeResponseProjection node(String alias, FlowInstanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public FlowInstanceEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
