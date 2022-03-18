package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * Properties by which location connections can be ordered.
 */

public enum LocationOrderFieldTO {

    /**
     * Order locations by name.
     */
    NAME("NAME");

    private final String graphqlName;

    private LocationOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
