package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLocationTypeMutationResponse extends GraphQLResult<Map<String, LocationTypeTO>> {

    private static final String OPERATION_NAME = "addLocationType";

    public AddLocationTypeMutationResponse() {
    }

    public LocationTypeTO addLocationType() {
        Map<String, LocationTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
