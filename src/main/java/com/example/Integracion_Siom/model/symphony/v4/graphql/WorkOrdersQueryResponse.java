package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrdersQueryResponse extends GraphQLResult<Map<String, WorkOrderConnectionTO>> {

    private static final String OPERATION_NAME = "workOrders";

    public WorkOrdersQueryResponse() {
    }

    public WorkOrderConnectionTO workOrders() {
        Map<String, WorkOrderConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
