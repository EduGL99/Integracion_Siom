package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * what type of equipment we filter about
 */

public enum EquipmentFilterTypeTO {

    EQUIP_INST_NAME("EQUIP_INST_NAME"),
    EQUIP_INST_EXTERNAL_ID("EQUIP_INST_EXTERNAL_ID"),
    PROPERTY("PROPERTY"),
    LOCATION_INST("LOCATION_INST"),
    LOCATION_INST_EXTERNAL_ID("LOCATION_INST_EXTERNAL_ID"),
    EQUIPMENT_TYPE("EQUIPMENT_TYPE");

    private final String graphqlName;

    private EquipmentFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
