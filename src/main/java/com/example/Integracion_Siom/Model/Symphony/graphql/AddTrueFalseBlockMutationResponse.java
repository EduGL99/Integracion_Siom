package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddTrueFalseBlockMutationResponse extends GraphQLResult<Map<String, BlockTO>> {

    private static final String OPERATION_NAME = "addTrueFalseBlock";

    public AddTrueFalseBlockMutationResponse() {
    }

    public BlockTO addTrueFalseBlock() {
        Map<String, BlockTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
