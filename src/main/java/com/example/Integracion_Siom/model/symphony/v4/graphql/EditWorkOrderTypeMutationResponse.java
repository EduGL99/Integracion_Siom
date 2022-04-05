package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditWorkOrderTypeMutationResponse extends GraphQLResult<Map<String, WorkOrderTypeTO>> {

    private static final String OPERATION_NAME = "editWorkOrderType";

    public EditWorkOrderTypeMutationResponse() {
    }

    public WorkOrderTypeTO editWorkOrderType() {
        Map<String, WorkOrderTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
