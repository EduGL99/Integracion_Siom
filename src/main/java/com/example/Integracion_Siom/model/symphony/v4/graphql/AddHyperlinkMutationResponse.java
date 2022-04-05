package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddHyperlinkMutationResponse extends GraphQLResult<Map<String, HyperlinkTO>> {

    private static final String OPERATION_NAME = "addHyperlink";

    public AddHyperlinkMutationResponse() {
    }

    public HyperlinkTO addHyperlink() {
        Map<String, HyperlinkTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
