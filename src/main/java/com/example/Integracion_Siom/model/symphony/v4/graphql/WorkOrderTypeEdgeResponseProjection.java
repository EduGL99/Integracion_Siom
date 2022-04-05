package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTypeEdgeResponseProjection extends GraphQLResponseProjection {

    public WorkOrderTypeEdgeResponseProjection() {
    }

    public WorkOrderTypeEdgeResponseProjection node(WorkOrderTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public WorkOrderTypeEdgeResponseProjection node(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public WorkOrderTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
