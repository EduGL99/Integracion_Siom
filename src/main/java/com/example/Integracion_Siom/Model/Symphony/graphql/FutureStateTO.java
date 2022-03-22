package com.example.Integracion_Siom.Model.Symphony.graphql;

/**
 * FutureState of an equipment.
 */

public enum FutureStateTO {

    INSTALL("INSTALL"),
    REMOVE("REMOVE");

    private final String graphqlName;

    FutureStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
