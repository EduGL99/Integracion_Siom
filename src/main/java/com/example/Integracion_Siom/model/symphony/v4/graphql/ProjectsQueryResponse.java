package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectsQueryResponse extends GraphQLResult<Map<String, ProjectConnectionTO>> {

    private static final String OPERATION_NAME = "projects";

    public ProjectsQueryResponse() {
    }

    public ProjectConnectionTO projects() {
        Map<String, ProjectConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
