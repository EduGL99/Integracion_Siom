package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWorkerTypeMutationResponse extends GraphQLResult<Map<String, WorkerTypeTO>> {

    private static final String OPERATION_NAME = "addWorkerType";

    public AddWorkerTypeMutationResponse() {
    }

    public WorkerTypeTO addWorkerType() {
        Map<String, WorkerTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
