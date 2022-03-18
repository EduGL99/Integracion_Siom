package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersQueryResponse extends GraphQLResult<Map<String, UserConnectionTO>> {

    private static final String OPERATION_NAME = "users";

    public UsersQueryResponse() {
    }

    public UserConnectionTO users() {
        Map<String, UserConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
