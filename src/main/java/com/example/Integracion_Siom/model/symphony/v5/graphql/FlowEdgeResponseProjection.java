package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowEdge
 */

public class FlowEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowEdgeResponseProjection() {
    }

    public FlowEdgeResponseProjection all$() {
        return all$(3);
    }

    public FlowEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("FlowEdgeResponseProjection.FlowResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowEdgeResponseProjection.FlowResponseProjection.node", projectionDepthOnFields.getOrDefault("FlowEdgeResponseProjection.FlowResponseProjection.node", 0) + 1);
            this.node(new FlowResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowEdgeResponseProjection.FlowResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
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

    public FlowEdgeResponseProjection typename() {
        return typename(null);
    }

    public FlowEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
