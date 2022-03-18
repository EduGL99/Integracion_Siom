package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class CustomersQueryResponse extends GraphQLResult<Map<String, CustomerConnectionTO>> {

    private static final String OPERATION_NAME = "customers";

    public CustomersQueryResponse() {
    }

    public CustomerConnectionTO customers() {
        Map<String, CustomerConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
