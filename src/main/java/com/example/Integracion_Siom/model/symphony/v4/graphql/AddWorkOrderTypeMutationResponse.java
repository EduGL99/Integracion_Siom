package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWorkOrderTypeMutationResponse extends GraphQLResult<Map<String, WorkOrderTypeTO>> {

    private static final String OPERATION_NAME = "addWorkOrderType";

    public AddWorkOrderTypeMutationResponse() {
    }

    public WorkOrderTypeTO addWorkOrderType() {
        Map<String, WorkOrderTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
