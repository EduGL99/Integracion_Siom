package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveServiceMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeService";

    public RemoveServiceMutationResponse() {
    }

    public String removeService() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
