package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderStatusChangedPayloadResponseProjection extends GraphQLResponseProjection {

    public WorkOrderStatusChangedPayloadResponseProjection() {
    }

    public WorkOrderStatusChangedPayloadResponseProjection from() {
        return from(null);
    }

    public WorkOrderStatusChangedPayloadResponseProjection from(String alias) {
        fields.add(new GraphQLResponseField("from").alias(alias));
        return this;
    }

    public WorkOrderStatusChangedPayloadResponseProjection to() {
        return to(null);
    }

    public WorkOrderStatusChangedPayloadResponseProjection to(String alias) {
        fields.add(new GraphQLResponseField("to").alias(alias));
        return this;
    }

    public WorkOrderStatusChangedPayloadResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public WorkOrderStatusChangedPayloadResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }


}
