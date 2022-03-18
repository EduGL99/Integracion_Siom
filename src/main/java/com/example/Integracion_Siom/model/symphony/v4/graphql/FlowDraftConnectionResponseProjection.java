package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowDraftConnectionResponseProjection extends GraphQLResponseProjection {

    public FlowDraftConnectionResponseProjection() {
    }

    public FlowDraftConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public FlowDraftConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FlowDraftConnectionResponseProjection edges(FlowDraftEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public FlowDraftConnectionResponseProjection edges(String alias, FlowDraftEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public FlowDraftConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
