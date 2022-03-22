package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveTechMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeTech";

    public RemoveTechMutationResponse() {
    }

    public String removeTech() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}