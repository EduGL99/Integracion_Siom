package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditKpiCategoryMutationResponse extends GraphQLResult<Map<String, KpiCategoryTO>> {

    private static final String OPERATION_NAME = "editKpiCategory";

    public EditKpiCategoryMutationResponse() {
    }

    public KpiCategoryTO editKpiCategory() {
        Map<String, KpiCategoryTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
