package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPoliciesQueryResponse extends GraphQLResult<Map<String, PermissionsPolicyConnectionTO>> {

    private static final String OPERATION_NAME = "permissionsPolicies";

    public PermissionsPoliciesQueryResponse() {
    }

    public PermissionsPolicyConnectionTO permissionsPolicies() {
        Map<String, PermissionsPolicyConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
