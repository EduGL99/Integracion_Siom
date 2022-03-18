package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum VariableUsageTO {

    INPUT("INPUT"),
    OUTPUT("OUTPUT"),
    INPUT_AND_OUTPUT("INPUT_AND_OUTPUT");

    private final String graphqlName;

    private VariableUsageTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
