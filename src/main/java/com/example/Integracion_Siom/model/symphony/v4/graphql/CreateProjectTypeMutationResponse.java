package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateProjectTypeMutationResponse extends GraphQLResult<Map<String, ProjectTypeTO>> {

    private static final String OPERATION_NAME = "createProjectType";

    public CreateProjectTypeMutationResponse() {
    }

    public ProjectTypeTO createProjectType() {
        Map<String, ProjectTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
