package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum VariableUsageTO {

    INPUT("INPUT"),
    OUTPUT("OUTPUT"),
    INPUT_AND_OUTPUT("INPUT_AND_OUTPUT");

    private final String graphqlName;

    VariableUsageTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
