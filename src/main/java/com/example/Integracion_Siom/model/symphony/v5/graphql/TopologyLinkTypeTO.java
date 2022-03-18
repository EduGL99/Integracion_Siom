package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum TopologyLinkTypeTO {

    PHYSICAL("PHYSICAL");

    private final String graphqlName;

    private TopologyLinkTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
