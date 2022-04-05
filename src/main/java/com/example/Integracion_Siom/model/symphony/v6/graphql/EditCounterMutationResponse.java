package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditCounterMutationResponse extends GraphQLResult<Map<String, CounterTO>> {

    private static final String OPERATION_NAME = "editCounter";

    public EditCounterMutationResponse() {
    }

    public CounterTO editCounter() {
        Map<String, CounterTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
