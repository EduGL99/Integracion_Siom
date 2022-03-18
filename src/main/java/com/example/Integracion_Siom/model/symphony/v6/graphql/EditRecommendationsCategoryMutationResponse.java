package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditRecommendationsCategoryMutationResponse extends GraphQLResult<Map<String, RecommendationsCategoryTO>> {

    private static final String OPERATION_NAME = "editRecommendationsCategory";

    public EditRecommendationsCategoryMutationResponse() {
    }

    public RecommendationsCategoryTO editRecommendationsCategory() {
        Map<String, RecommendationsCategoryTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
