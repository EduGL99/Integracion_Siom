package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VertexQueryResponse extends GraphQLResult<Map<String, VertexTO>> {

    private static final String OPERATION_NAME = "vertex";

    public VertexQueryResponse() {
    }

    public VertexTO vertex() {
        Map<String, VertexTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
