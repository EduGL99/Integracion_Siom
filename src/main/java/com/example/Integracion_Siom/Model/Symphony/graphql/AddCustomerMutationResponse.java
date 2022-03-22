package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddCustomerMutationResponse extends GraphQLResult<Map<String, CustomerTO>> {

    private static final String OPERATION_NAME = "addCustomer";

    public AddCustomerMutationResponse() {
    }

    public CustomerTO addCustomer() {
        Map<String, CustomerTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
