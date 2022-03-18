package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectAddedSubscriptionResponse extends GraphQLResult<Map<String, ProjectTO>> {

    private static final String OPERATION_NAME = "projectAdded";

    public ProjectAddedSubscriptionResponse() {
    }

    public ProjectTO projectAdded() {
        Map<String, ProjectTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
