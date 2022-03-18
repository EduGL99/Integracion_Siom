package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTypeConnectionResponseProjection extends GraphQLResponseProjection {

    public WorkOrderTypeConnectionResponseProjection() {
    }

    public WorkOrderTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public WorkOrderTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public WorkOrderTypeConnectionResponseProjection edges(WorkOrderTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public WorkOrderTypeConnectionResponseProjection edges(String alias, WorkOrderTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public WorkOrderTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
