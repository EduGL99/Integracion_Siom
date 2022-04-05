package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationsQueryResponse extends GraphQLResult<Map<String, LocationConnectionTO>> {

    private static final String OPERATION_NAME = "locations";

    public LocationsQueryResponse() {
    }

    public LocationConnectionTO locations() {
        Map<String, LocationConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
