package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowDraftEdgeResponseProjection extends GraphQLResponseProjection {

    public FlowDraftEdgeResponseProjection() {
    }

    public FlowDraftEdgeResponseProjection node(FlowDraftResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public FlowDraftEdgeResponseProjection node(String alias, FlowDraftResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public FlowDraftEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
