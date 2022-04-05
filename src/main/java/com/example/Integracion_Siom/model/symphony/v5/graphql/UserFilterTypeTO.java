package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * what filters should we apply on users
 */

public enum UserFilterTypeTO {

    USER_NAME("USER_NAME"),
    USER_STATUS("USER_STATUS");

    private final String graphqlName;

    private UserFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
