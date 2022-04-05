package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTypesQueryResponse extends GraphQLResult<Map<String, ProjectTypeConnectionTO>> {

    private static final String OPERATION_NAME = "projectTypes";

    public ProjectTypesQueryResponse() {
    }

    public ProjectTypeConnectionTO projectTypes() {
        Map<String, ProjectTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
