package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum UserRoleTO {

    USER("USER"),
    ADMIN("ADMIN"),
    OWNER("OWNER");

    private final String graphqlName;

    private UserRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
