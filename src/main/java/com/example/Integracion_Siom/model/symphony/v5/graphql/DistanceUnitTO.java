package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum DistanceUnitTO {

    KILOMETER("KILOMETER"),
    MILE("MILE");

    private final String graphqlName;

    private DistanceUnitTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
