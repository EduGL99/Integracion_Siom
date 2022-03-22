package com.example.Integracion_Siom.Model.Symphony.graphql;

/**
 * Properties by which location connections can be ordered.
 */

public enum LocationOrderFieldTO {

    /**
     * Order locations by name.
     */
    NAME("NAME");

    private final String graphqlName;

    LocationOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
