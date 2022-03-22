package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum DiscoveryMethodTO {

    MANUAL("MANUAL"),
    INVENTORY("INVENTORY");

    private final String graphqlName;

    DiscoveryMethodTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
