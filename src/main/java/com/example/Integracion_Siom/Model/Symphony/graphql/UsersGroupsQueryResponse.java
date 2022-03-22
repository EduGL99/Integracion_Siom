package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class UsersGroupsQueryResponse extends GraphQLResult<Map<String, UsersGroupConnectionTO>> {

    private static final String OPERATION_NAME = "usersGroups";

    public UsersGroupsQueryResponse() {
    }

    public UsersGroupConnectionTO usersGroups() {
        Map<String, UsersGroupConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
