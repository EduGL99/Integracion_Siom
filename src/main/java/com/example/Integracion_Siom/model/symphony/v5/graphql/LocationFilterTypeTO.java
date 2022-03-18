package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * what filters should we apply on locations
 */

public enum LocationFilterTypeTO {

    LOCATION_INST("LOCATION_INST"),
    LOCATION_INST_NAME("LOCATION_INST_NAME"),
    LOCATION_INST_EXTERNAL_ID("LOCATION_INST_EXTERNAL_ID"),
    LOCATION_TYPE("LOCATION_TYPE"),
    LOCATION_INST_HAS_EQUIPMENT("LOCATION_INST_HAS_EQUIPMENT"),
    PROPERTY("PROPERTY");

    private final String graphqlName;

    private LocationFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
