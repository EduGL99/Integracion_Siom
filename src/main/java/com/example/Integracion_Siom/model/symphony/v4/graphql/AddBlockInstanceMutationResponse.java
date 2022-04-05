package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddBlockInstanceMutationResponse extends GraphQLResult<Map<String, BlockInstanceTO>> {

    private static final String OPERATION_NAME = "addBlockInstance";

    public AddBlockInstanceMutationResponse() {
    }

    public BlockInstanceTO addBlockInstance() {
        Map<String, BlockInstanceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
