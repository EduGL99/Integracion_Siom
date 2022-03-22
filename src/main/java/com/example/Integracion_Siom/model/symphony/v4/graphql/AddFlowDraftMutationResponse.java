package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddFlowDraftMutationResponse extends GraphQLResult<Map<String, FlowDraftTO>> {

    private static final String OPERATION_NAME = "addFlowDraft";

    public AddFlowDraftMutationResponse() {
    }

    public FlowDraftTO addFlowDraft() {
        Map<String, FlowDraftTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}