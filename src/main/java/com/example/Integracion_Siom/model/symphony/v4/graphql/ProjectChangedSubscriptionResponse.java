package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectChangedSubscriptionResponse extends GraphQLResult<Map<String, ProjectTO>> {

    private static final String OPERATION_NAME = "projectChanged";

    public ProjectChangedSubscriptionResponse() {
    }

    public ProjectTO projectChanged() {
        Map<String, ProjectTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
