package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchNodesConnectionResponseProjection extends GraphQLResponseProjection {

    public SearchNodesConnectionResponseProjection() {
    }

    public SearchNodesConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public SearchNodesConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public SearchNodesConnectionResponseProjection edges(SearchNodeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SearchNodesConnectionResponseProjection edges(String alias, SearchNodeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SearchNodesConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SearchNodesConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
