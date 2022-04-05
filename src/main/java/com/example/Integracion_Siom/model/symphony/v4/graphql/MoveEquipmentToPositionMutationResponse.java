package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveEquipmentToPositionMutationResponse extends GraphQLResult<Map<String, EquipmentPositionTO>> {

    private static final String OPERATION_NAME = "moveEquipmentToPosition";

    public MoveEquipmentToPositionMutationResponse() {
    }

    public EquipmentPositionTO moveEquipmentToPosition() {
        Map<String, EquipmentPositionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
