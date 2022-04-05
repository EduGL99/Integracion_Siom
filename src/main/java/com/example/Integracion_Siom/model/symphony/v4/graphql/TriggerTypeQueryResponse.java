package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerTypeQueryResponse extends GraphQLResult<Map<String, TriggerTypeTO>> {

    private static final String OPERATION_NAME = "triggerType";

    public TriggerTypeQueryResponse() {
    }

    public TriggerTypeTO triggerType() {
        Map<String, TriggerTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
