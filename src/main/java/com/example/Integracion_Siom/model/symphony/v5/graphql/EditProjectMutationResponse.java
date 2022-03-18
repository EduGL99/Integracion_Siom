package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditProjectMutationResponse extends GraphQLResult<Map<String, ProjectTO>> {

    private static final String OPERATION_NAME = "editProject";

    public EditProjectMutationResponse() {
    }

    public ProjectTO editProject() {
        Map<String, ProjectTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
