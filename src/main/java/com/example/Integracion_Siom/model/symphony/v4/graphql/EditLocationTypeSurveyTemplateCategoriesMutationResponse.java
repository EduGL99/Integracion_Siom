package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditLocationTypeSurveyTemplateCategoriesMutationResponse extends GraphQLResult<Map<String, java.util.List<SurveyTemplateCategoryTO>>> {

    private static final String OPERATION_NAME = "editLocationTypeSurveyTemplateCategories";

    public EditLocationTypeSurveyTemplateCategoriesMutationResponse() {
    }

    public java.util.List<SurveyTemplateCategoryTO> editLocationTypeSurveyTemplateCategories() {
        Map<String, java.util.List<SurveyTemplateCategoryTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
