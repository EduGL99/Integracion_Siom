package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditEquipmentTypeMutationResponse extends GraphQLResult<Map<String, EquipmentTypeTO>> {

    private static final String OPERATION_NAME = "editEquipmentType";

    public EditEquipmentTypeMutationResponse() {
    }

    public EquipmentTypeTO editEquipmentType() {
        Map<String, EquipmentTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
