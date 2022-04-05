package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class LocationAddedSubscriptionResponse extends GraphQLResult<Map<String, LocationTO>> {

    private static final String OPERATION_NAME = "locationAdded";

    public LocationAddedSubscriptionResponse() {
    }

    public LocationTO locationAdded() {
        Map<String, LocationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
