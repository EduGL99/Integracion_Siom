package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum ExitPointRoleTO {

    DEFAULT("DEFAULT"),
    DECISION("DECISION");

    private final String graphqlName;

    ExitPointRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
