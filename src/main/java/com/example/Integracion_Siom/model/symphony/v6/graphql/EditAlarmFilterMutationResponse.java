package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditAlarmFilterMutationResponse extends GraphQLResult<Map<String, AlarmFilterTO>> {

    private static final String OPERATION_NAME = "editAlarmFilter";

    public EditAlarmFilterMutationResponse() {
    }

    public AlarmFilterTO editAlarmFilter() {
        Map<String, AlarmFilterTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
