package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeQueryResponse extends GraphQLResult<Map<String, NodeTO>> {

    private static final String OPERATION_NAME = "node";

    public NodeQueryResponse() {
    }

    public NodeTO node() {
        Map<String, NodeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
