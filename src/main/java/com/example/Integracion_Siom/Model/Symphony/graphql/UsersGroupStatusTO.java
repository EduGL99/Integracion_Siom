package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum UsersGroupStatusTO {

    ACTIVE("ACTIVE"),
    DEACTIVATED("DEACTIVATED");

    private final String graphqlName;

    UsersGroupStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
