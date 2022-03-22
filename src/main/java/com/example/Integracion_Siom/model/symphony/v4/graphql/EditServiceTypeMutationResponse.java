package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditServiceTypeMutationResponse extends GraphQLResult<Map<String, ServiceTypeTO>> {

    private static final String OPERATION_NAME = "editServiceType";

    public EditServiceTypeMutationResponse() {
    }

    public ServiceTypeTO editServiceType() {
        Map<String, ServiceTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}