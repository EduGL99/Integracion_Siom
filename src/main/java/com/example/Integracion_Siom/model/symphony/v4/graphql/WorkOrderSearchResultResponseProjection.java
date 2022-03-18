package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderSearchResultResponseProjection extends GraphQLResponseProjection {

    public WorkOrderSearchResultResponseProjection() {
    }

    public WorkOrderSearchResultResponseProjection workOrders(WorkOrderResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public WorkOrderSearchResultResponseProjection workOrders(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderSearchResultResponseProjection count() {
        return count(null);
    }

    public WorkOrderSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
