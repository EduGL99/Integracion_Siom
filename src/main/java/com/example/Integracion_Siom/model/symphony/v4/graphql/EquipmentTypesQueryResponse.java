package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTypesQueryResponse extends GraphQLResult<Map<String, EquipmentTypeConnectionTO>> {

    private static final String OPERATION_NAME = "equipmentTypes";

    public EquipmentTypesQueryResponse() {
    }

    public EquipmentTypeConnectionTO equipmentTypes() {
        Map<String, EquipmentTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
