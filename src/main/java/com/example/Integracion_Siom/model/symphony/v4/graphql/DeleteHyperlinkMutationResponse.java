package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteHyperlinkMutationResponse extends GraphQLResult<Map<String, HyperlinkTO>> {

    private static final String OPERATION_NAME = "deleteHyperlink";

    public DeleteHyperlinkMutationResponse() {
    }

    public HyperlinkTO deleteHyperlink() {
        Map<String, HyperlinkTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
