package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkerTypeConnectionResponseProjection extends GraphQLResponseProjection {

    public WorkerTypeConnectionResponseProjection() {
    }

    public WorkerTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public WorkerTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public WorkerTypeConnectionResponseProjection edges(WorkerTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public WorkerTypeConnectionResponseProjection edges(String alias, WorkerTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public WorkerTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public WorkerTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
