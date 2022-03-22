package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum NetworkTypeFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    NetworkTypeFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
