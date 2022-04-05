package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum ExitPointRoleTO {

    DEFAULT("DEFAULT"),
    DECISION("DECISION");

    private final String graphqlName;

    private ExitPointRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
