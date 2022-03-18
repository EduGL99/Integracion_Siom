package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveCustomerMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeCustomer";

    public RemoveCustomerMutationResponse() {
    }

    public String removeCustomer() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
