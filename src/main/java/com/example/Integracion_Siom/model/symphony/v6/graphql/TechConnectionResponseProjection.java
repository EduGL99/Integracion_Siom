package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for TechConnection
 */

public class TechConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public TechConnectionResponseProjection() {
    }

    public TechConnectionResponseProjection all$() {
        return all$(3);
    }

    public TechConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("TechConnectionResponseProjection.TechEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("TechConnectionResponseProjection.TechEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("TechConnectionResponseProjection.TechEdgeResponseProjection.edges", 0) + 1);
            this.edges(new TechEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TechConnectionResponseProjection.TechEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TechConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("TechConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("TechConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TechConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public TechConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public TechConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public TechConnectionResponseProjection edges(TechEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public TechConnectionResponseProjection edges(String alias, TechEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public TechConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public TechConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public TechConnectionResponseProjection typename() {
        return typename(null);
    }

    public TechConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
