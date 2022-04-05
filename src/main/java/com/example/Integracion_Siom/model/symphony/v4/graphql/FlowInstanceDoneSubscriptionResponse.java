package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowInstanceDoneSubscriptionResponse extends GraphQLResult<Map<String, FlowInstanceTO>> {

    private static final String OPERATION_NAME = "flowInstanceDone";

    public FlowInstanceDoneSubscriptionResponse() {
    }

    public FlowInstanceTO flowInstanceDone() {
        Map<String, FlowInstanceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
