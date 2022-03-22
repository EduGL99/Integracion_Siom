package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum OrganizationFilterTypeTO {

    ID("ID"),
    NAME("NAME"),
    DESCRIPTION("DESCRIPTION");

    private final String graphqlName;

    OrganizationFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
