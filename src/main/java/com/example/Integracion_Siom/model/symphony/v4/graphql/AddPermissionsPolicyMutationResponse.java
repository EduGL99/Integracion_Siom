package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddPermissionsPolicyMutationResponse extends GraphQLResult<Map<String, PermissionsPolicyTO>> {

    private static final String OPERATION_NAME = "addPermissionsPolicy";

    public AddPermissionsPolicyMutationResponse() {
    }

    public PermissionsPolicyTO addPermissionsPolicy() {
        Map<String, PermissionsPolicyTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
