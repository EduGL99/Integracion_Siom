package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentsQueryResponse extends GraphQLResult<Map<String, EquipmentConnectionTO>> {

    private static final String OPERATION_NAME = "equipments";

    public EquipmentsQueryResponse() {
    }

    public EquipmentConnectionTO equipments() {
        Map<String, EquipmentConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
