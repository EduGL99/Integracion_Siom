package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKqiCategoryMutationResponse extends GraphQLResult<Map<String, KqiCategoryTO>> {

    private static final String OPERATION_NAME = "addKqiCategory";

    public AddKqiCategoryMutationResponse() {
    }

    public KqiCategoryTO addKqiCategory() {
        Map<String, KqiCategoryTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
