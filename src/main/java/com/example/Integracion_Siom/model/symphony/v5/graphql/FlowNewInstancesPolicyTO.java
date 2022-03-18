package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum FlowNewInstancesPolicyTO {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private final String graphqlName;

    private FlowNewInstancesPolicyTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
