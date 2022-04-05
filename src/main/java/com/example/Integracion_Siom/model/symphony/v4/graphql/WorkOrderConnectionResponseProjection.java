package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderConnectionResponseProjection extends GraphQLResponseProjection {

    public WorkOrderConnectionResponseProjection() {
    }

    public WorkOrderConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public WorkOrderConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public WorkOrderConnectionResponseProjection edges(WorkOrderEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public WorkOrderConnectionResponseProjection edges(String alias, WorkOrderEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public WorkOrderConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
