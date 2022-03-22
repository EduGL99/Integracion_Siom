package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum KpiFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KpiFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
