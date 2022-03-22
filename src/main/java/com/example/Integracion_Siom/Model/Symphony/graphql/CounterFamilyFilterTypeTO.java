package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum CounterFamilyFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    CounterFamilyFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
