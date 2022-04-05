package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class WorkOrderAddedSubscriptionResponse extends GraphQLResult<Map<String, WorkOrderTO>> {

    private static final String OPERATION_NAME = "workOrderAdded";

    public WorkOrderAddedSubscriptionResponse() {
    }

    public WorkOrderTO workOrderAdded() {
        Map<String, WorkOrderTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
