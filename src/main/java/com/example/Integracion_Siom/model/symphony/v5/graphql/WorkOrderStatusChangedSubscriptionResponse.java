package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class WorkOrderStatusChangedSubscriptionResponse extends GraphQLResult<Map<String, WorkOrderStatusChangedPayloadTO>> {

    private static final String OPERATION_NAME = "workOrderStatusChanged";

    public WorkOrderStatusChangedSubscriptionResponse() {
    }

    public WorkOrderStatusChangedPayloadTO workOrderStatusChanged() {
        Map<String, WorkOrderStatusChangedPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
