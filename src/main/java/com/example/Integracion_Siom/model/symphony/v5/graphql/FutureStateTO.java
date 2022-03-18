package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * FutureState of an equipment.
 */

public enum FutureStateTO {

    INSTALL("INSTALL"),
    REMOVE("REMOVE");

    private final String graphqlName;

    private FutureStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
