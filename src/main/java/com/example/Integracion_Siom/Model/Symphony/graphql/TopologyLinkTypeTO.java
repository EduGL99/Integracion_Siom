package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum TopologyLinkTypeTO {

    PHYSICAL("PHYSICAL");

    private final String graphqlName;

    TopologyLinkTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
