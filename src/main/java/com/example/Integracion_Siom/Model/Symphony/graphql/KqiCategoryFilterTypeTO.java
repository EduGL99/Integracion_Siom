package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum KqiCategoryFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiCategoryFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
