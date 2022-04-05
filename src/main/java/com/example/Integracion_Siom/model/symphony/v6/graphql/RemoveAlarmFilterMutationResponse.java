package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveAlarmFilterMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeAlarmFilter";

    public RemoveAlarmFilterMutationResponse() {
    }

    public String removeAlarmFilter() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
