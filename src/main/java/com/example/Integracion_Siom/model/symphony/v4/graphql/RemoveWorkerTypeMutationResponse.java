package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveWorkerTypeMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeWorkerType";

    public RemoveWorkerTypeMutationResponse() {
    }

    public String removeWorkerType() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
