package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class CreateProjectMutationResponse extends GraphQLResult<Map<String, ProjectTO>> {

    private static final String OPERATION_NAME = "createProject";

    public CreateProjectMutationResponse() {
    }

    public ProjectTO createProject() {
        Map<String, ProjectTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
