package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum KqiSourceFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiSourceFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
