package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveDocumentCategoryMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeDocumentCategory";

    public RemoveDocumentCategoryMutationResponse() {
    }

    public String removeDocumentCategory() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
