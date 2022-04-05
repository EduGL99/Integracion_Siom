package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLocationMutationResponse extends GraphQLResult<Map<String, LocationTO>> {

    private static final String OPERATION_NAME = "addLocation";

    public AddLocationMutationResponse() {
    }

    public LocationTO addLocation() {
        Map<String, LocationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
