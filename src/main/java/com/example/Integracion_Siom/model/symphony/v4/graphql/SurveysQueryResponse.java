package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveysQueryResponse extends GraphQLResult<Map<String, java.util.List<SurveyTO>>> {

    private static final String OPERATION_NAME = "surveys";

    public SurveysQueryResponse() {
    }

    public java.util.List<SurveyTO> surveys() {
        Map<String, java.util.List<SurveyTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
