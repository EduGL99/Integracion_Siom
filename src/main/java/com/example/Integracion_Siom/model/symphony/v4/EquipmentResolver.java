package com.example.Integracion_Siom.model.symphony.v4;

import com.example.Integracion_Siom.model.symphony.v4.graphql.EquipmentPortTO;
import com.example.Integracion_Siom.model.symphony.v4.graphql.EquipmentTO;

/**
 * Resolver for Equipment
 */
public interface EquipmentResolver {

    @javax.validation.constraints.NotNull
    java.util.List<EquipmentPortTO> ports(EquipmentTO equipmentTO, Boolean availableOnly) throws Exception;

}