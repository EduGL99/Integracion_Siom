package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PublishFlowMutationResponse extends GraphQLResult<Map<String, FlowTO>> {

    private static final String OPERATION_NAME = "publishFlow";

    public PublishFlowMutationResponse() {
    }

    public FlowTO publishFlow() {
        Map<String, FlowTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
