package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditLocationTypesIndexMutationResponse extends GraphQLResult<Map<String, java.util.List<LocationTypeTO>>> {

    private static final String OPERATION_NAME = "editLocationTypesIndex";

    public EditLocationTypesIndexMutationResponse() {
    }

    public java.util.List<LocationTypeTO> editLocationTypesIndex() {
        Map<String, java.util.List<LocationTypeTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
