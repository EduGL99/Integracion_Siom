package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum ThresholdFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    ThresholdFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
