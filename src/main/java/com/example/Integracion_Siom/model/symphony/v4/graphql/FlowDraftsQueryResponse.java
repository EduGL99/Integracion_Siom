package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowDraftsQueryResponse extends GraphQLResult<Map<String, FlowDraftConnectionTO>> {

    private static final String OPERATION_NAME = "flowDrafts";

    public FlowDraftsQueryResponse() {
    }

    public FlowDraftConnectionTO flowDrafts() {
        Map<String, FlowDraftConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
