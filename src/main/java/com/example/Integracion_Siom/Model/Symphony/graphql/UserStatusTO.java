package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum UserStatusTO {

    ACTIVE("ACTIVE"),
    DEACTIVATED("DEACTIVATED");

    private final String graphqlName;

    UserStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
