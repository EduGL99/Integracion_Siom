package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTypesQueryResponse extends GraphQLResult<Map<String, ServiceTypeConnectionTO>> {

    private static final String OPERATION_NAME = "serviceTypes";

    public ServiceTypesQueryResponse() {
    }

    public ServiceTypeConnectionTO serviceTypes() {
        Map<String, ServiceTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
