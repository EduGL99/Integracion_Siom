package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveThresholdMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeThreshold";

    public RemoveThresholdMutationResponse() {
    }

    public String removeThreshold() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
