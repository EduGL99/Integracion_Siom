package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum PropertyEntityTO {

    EQUIPMENT("EQUIPMENT"),
    SERVICE("SERVICE"),
    LINK("LINK"),
    PORT("PORT"),
    LOCATION("LOCATION"),
    WORK_ORDER("WORK_ORDER"),
    PROJECT("PROJECT");

    private final String graphqlName;

    PropertyEntityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
