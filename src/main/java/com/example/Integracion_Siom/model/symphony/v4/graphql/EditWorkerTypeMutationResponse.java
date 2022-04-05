package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditWorkerTypeMutationResponse extends GraphQLResult<Map<String, WorkerTypeTO>> {

    private static final String OPERATION_NAME = "editWorkerType";

    public EditWorkerTypeMutationResponse() {
    }

    public WorkerTypeTO editWorkerType() {
        Map<String, WorkerTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
