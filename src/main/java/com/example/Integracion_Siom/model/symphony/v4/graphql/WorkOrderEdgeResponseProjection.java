package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderEdgeResponseProjection extends GraphQLResponseProjection {

    public WorkOrderEdgeResponseProjection() {
    }

    public WorkOrderEdgeResponseProjection node(WorkOrderResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public WorkOrderEdgeResponseProjection node(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public WorkOrderEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
