package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServicesQueryResponse extends GraphQLResult<Map<String, ServiceConnectionTO>> {

    private static final String OPERATION_NAME = "services";

    public ServicesQueryResponse() {
    }

    public ServiceConnectionTO services() {
        Map<String, ServiceConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
