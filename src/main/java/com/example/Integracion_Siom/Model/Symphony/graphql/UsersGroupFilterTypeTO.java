package com.example.Integracion_Siom.Model.Symphony.graphql;

/**
 * what filters should we apply on usersGroups
 */

public enum UsersGroupFilterTypeTO {

    GROUP_NAME("GROUP_NAME");

    private final String graphqlName;

    UsersGroupFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
