package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserGroupsMutationResponse extends GraphQLResult<Map<String, UserTO>> {

    private static final String OPERATION_NAME = "updateUserGroups";

    public UpdateUserGroupsMutationResponse() {
    }

    public UserTO updateUserGroups() {
        Map<String, UserTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
