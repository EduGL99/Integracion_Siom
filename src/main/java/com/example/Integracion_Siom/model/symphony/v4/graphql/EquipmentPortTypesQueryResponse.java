package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortTypesQueryResponse extends GraphQLResult<Map<String, EquipmentPortTypeConnectionTO>> {

    private static final String OPERATION_NAME = "equipmentPortTypes";

    public EquipmentPortTypesQueryResponse() {
    }

    public EquipmentPortTypeConnectionTO equipmentPortTypes() {
        Map<String, EquipmentPortTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
