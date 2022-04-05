package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKqiComparatorMutationResponse extends GraphQLResult<Map<String, KqiComparatorTO>> {

    private static final String OPERATION_NAME = "addKqiComparator";

    public AddKqiComparatorMutationResponse() {
    }

    public KqiComparatorTO addKqiComparator() {
        Map<String, KqiComparatorTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
