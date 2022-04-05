package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum DiscoveryMethodTO {

    MANUAL("MANUAL"),
    INVENTORY("INVENTORY");

    private final String graphqlName;

    private DiscoveryMethodTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
