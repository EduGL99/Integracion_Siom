package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowsQueryResponse extends GraphQLResult<Map<String, FlowConnectionTO>> {

    private static final String OPERATION_NAME = "flows";

    public FlowsQueryResponse() {
    }

    public FlowConnectionTO flows() {
        Map<String, FlowConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
