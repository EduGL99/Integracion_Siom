package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTypesQueryResponse extends GraphQLResult<Map<String, WorkOrderTypeConnectionTO>> {

    private static final String OPERATION_NAME = "workOrderTypes";

    public WorkOrderTypesQueryResponse() {
    }

    public WorkOrderTypeConnectionTO workOrderTypes() {
        Map<String, WorkOrderTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
