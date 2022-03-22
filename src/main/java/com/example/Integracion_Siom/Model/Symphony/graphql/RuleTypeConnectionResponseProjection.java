package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RuleTypeConnection
 */

public class RuleTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RuleTypeConnectionResponseProjection() {
    }

    public RuleTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public RuleTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("RuleTypeConnectionResponseProjection.RuleTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleTypeConnectionResponseProjection.RuleTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RuleTypeConnectionResponseProjection.RuleTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RuleTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleTypeConnectionResponseProjection.RuleTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RuleTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RuleTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public RuleTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RuleTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RuleTypeConnectionResponseProjection edges(RuleTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RuleTypeConnectionResponseProjection edges(String alias, RuleTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RuleTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RuleTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RuleTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public RuleTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
