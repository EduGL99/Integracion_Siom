package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum ComparatorFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    ComparatorFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
