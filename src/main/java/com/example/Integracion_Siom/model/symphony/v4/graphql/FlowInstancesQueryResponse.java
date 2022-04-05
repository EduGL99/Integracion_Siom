package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowInstancesQueryResponse extends GraphQLResult<Map<String, FlowInstanceConnectionTO>> {

    private static final String OPERATION_NAME = "flowInstances";

    public FlowInstancesQueryResponse() {
    }

    public FlowInstanceConnectionTO flowInstances() {
        Map<String, FlowInstanceConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
