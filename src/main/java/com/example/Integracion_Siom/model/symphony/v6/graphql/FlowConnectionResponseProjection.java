package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowConnection
 */

public class FlowConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowConnectionResponseProjection() {
    }

    public FlowConnectionResponseProjection all$() {
        return all$(3);
    }

    public FlowConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("FlowConnectionResponseProjection.FlowEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowConnectionResponseProjection.FlowEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("FlowConnectionResponseProjection.FlowEdgeResponseProjection.edges", 0) + 1);
            this.edges(new FlowEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowConnectionResponseProjection.FlowEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("FlowConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public FlowConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public FlowConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FlowConnectionResponseProjection edges(FlowEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public FlowConnectionResponseProjection edges(String alias, FlowEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public FlowConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public FlowConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public FlowConnectionResponseProjection typename() {
        return typename(null);
    }

    public FlowConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
