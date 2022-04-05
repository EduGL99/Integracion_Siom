package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditEquipmentPortTypeMutationResponse extends GraphQLResult<Map<String, EquipmentPortTypeTO>> {

    private static final String OPERATION_NAME = "editEquipmentPortType";

    public EditEquipmentPortTypeMutationResponse() {
    }

    public EquipmentPortTypeTO editEquipmentPortType() {
        Map<String, EquipmentPortTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
