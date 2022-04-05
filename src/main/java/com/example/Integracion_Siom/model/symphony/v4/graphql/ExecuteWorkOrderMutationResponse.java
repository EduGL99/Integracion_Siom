package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecuteWorkOrderMutationResponse extends GraphQLResult<Map<String, WorkOrderExecutionResultTO>> {

    private static final String OPERATION_NAME = "executeWorkOrder";

    public ExecuteWorkOrderMutationResponse() {
    }

    public WorkOrderExecutionResultTO executeWorkOrder() {
        Map<String, WorkOrderExecutionResultTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
