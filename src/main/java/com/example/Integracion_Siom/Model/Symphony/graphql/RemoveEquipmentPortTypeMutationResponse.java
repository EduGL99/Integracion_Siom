package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveEquipmentPortTypeMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeEquipmentPortType";

    public RemoveEquipmentPortTypeMutationResponse() {
    }

    public String removeEquipmentPortType() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
