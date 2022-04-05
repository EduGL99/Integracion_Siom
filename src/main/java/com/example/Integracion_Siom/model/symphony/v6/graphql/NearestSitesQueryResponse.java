package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class NearestSitesQueryResponse extends GraphQLResult<Map<String, java.util.List<LocationTO>>> {

    private static final String OPERATION_NAME = "nearestSites";

    public NearestSitesQueryResponse() {
    }

    public java.util.List<LocationTO> nearestSites() {
        Map<String, java.util.List<LocationTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
