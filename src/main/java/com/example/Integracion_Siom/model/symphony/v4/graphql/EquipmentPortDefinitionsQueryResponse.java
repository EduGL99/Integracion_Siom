package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortDefinitionsQueryResponse extends GraphQLResult<Map<String, EquipmentPortDefinitionConnectionTO>> {

    private static final String OPERATION_NAME = "equipmentPortDefinitions";

    public EquipmentPortDefinitionsQueryResponse() {
    }

    public EquipmentPortDefinitionConnectionTO equipmentPortDefinitions() {
        Map<String, EquipmentPortDefinitionConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
