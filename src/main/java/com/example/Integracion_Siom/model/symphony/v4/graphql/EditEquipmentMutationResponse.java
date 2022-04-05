package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditEquipmentMutationResponse extends GraphQLResult<Map<String, EquipmentTO>> {

    private static final String OPERATION_NAME = "editEquipment";

    public EditEquipmentMutationResponse() {
    }

    public EquipmentTO editEquipment() {
        Map<String, EquipmentTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
