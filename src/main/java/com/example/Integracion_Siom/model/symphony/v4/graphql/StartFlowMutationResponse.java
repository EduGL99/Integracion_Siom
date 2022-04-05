package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartFlowMutationResponse extends GraphQLResult<Map<String, FlowInstanceTO>> {

    private static final String OPERATION_NAME = "startFlow";

    public StartFlowMutationResponse() {
    }

    public FlowInstanceTO startFlow() {
        Map<String, FlowInstanceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
