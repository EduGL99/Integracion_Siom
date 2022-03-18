package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypesQueryResponse extends GraphQLResult<Map<String, LocationTypeConnectionTO>> {

    private static final String OPERATION_NAME = "locationTypes";

    public LocationTypesQueryResponse() {
    }

    public LocationTypeConnectionTO locationTypes() {
        Map<String, LocationTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
