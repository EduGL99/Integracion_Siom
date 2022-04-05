package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWorkOrderMutationResponse extends GraphQLResult<Map<String, WorkOrderTO>> {

    private static final String OPERATION_NAME = "addWorkOrder";

    public AddWorkOrderMutationResponse() {
    }

    public WorkOrderTO addWorkOrder() {
        Map<String, WorkOrderTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
