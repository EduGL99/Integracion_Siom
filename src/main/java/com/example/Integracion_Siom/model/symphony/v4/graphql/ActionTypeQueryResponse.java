package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionTypeQueryResponse extends GraphQLResult<Map<String, ActionTypeTO>> {

    private static final String OPERATION_NAME = "actionType";

    public ActionTypeQueryResponse() {
    }

    public ActionTypeTO actionType() {
        Map<String, ActionTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}