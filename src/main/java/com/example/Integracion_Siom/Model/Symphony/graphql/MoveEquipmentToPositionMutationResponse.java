package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class MoveEquipmentToPositionMutationResponse extends GraphQLResult<Map<String, EquipmentPositionTO>> {

    private static final String OPERATION_NAME = "moveEquipmentToPosition";

    public MoveEquipmentToPositionMutationResponse() {
    }

    public EquipmentPositionTO moveEquipmentToPosition() {
        Map<String, EquipmentPositionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
