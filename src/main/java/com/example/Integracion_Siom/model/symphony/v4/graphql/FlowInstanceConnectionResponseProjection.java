package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowInstanceConnectionResponseProjection extends GraphQLResponseProjection {

    public FlowInstanceConnectionResponseProjection() {
    }

    public FlowInstanceConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public FlowInstanceConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FlowInstanceConnectionResponseProjection edges(FlowInstanceEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public FlowInstanceConnectionResponseProjection edges(String alias, FlowInstanceEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public FlowInstanceConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
