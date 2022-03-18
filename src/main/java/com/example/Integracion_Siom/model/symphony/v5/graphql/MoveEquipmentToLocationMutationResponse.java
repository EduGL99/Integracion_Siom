package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class MoveEquipmentToLocationMutationResponse extends GraphQLResult<Map<String, EquipmentTO>> {

    private static final String OPERATION_NAME = "moveEquipmentToLocation";

    public MoveEquipmentToLocationMutationResponse() {
    }

    public EquipmentTO moveEquipmentToLocation() {
        Map<String, EquipmentTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
