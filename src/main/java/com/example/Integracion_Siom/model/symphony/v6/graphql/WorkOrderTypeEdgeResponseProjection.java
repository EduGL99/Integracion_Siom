package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderTypeEdge
 */

public class WorkOrderTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderTypeEdgeResponseProjection() {
    }

    public WorkOrderTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("WorkOrderTypeEdgeResponseProjection.WorkOrderTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderTypeEdgeResponseProjection.WorkOrderTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("WorkOrderTypeEdgeResponseProjection.WorkOrderTypeResponseProjection.node", 0) + 1);
            this.node(new WorkOrderTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderTypeEdgeResponseProjection.WorkOrderTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public WorkOrderTypeEdgeResponseProjection node(WorkOrderTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public WorkOrderTypeEdgeResponseProjection node(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public WorkOrderTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public WorkOrderTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
