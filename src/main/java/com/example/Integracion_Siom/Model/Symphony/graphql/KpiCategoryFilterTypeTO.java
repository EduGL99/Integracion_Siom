package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum KpiCategoryFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KpiCategoryFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
