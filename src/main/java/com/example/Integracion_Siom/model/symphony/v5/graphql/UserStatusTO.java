package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum UserStatusTO {

    ACTIVE("ACTIVE"),
    DEACTIVATED("DEACTIVATED");

    private final String graphqlName;

    private UserStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
