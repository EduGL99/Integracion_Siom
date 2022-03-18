package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum FilterEntityTO {

    WORK_ORDER("WORK_ORDER"),
    PORT("PORT"),
    EQUIPMENT("EQUIPMENT"),
    LINK("LINK"),
    LOCATION("LOCATION"),
    SERVICE("SERVICE");

    private final String graphqlName;

    private FilterEntityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
