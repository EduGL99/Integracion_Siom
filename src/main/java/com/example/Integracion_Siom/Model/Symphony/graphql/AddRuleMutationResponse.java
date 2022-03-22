package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddRuleMutationResponse extends GraphQLResult<Map<String, RuleTO>> {

    private static final String OPERATION_NAME = "addRule";

    public AddRuleMutationResponse() {
    }

    public RuleTO addRule() {
        Map<String, RuleTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
