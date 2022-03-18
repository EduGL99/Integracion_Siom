package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortsQueryResponse extends GraphQLResult<Map<String, EquipmentPortConnectionTO>> {

    private static final String OPERATION_NAME = "equipmentPorts";

    public EquipmentPortsQueryResponse() {
    }

    public EquipmentPortConnectionTO equipmentPorts() {
        Map<String, EquipmentPortConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
