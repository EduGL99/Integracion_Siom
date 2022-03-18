package com.example.Integracion_Siom.model.symphony.v6.graphql;


public enum ImageEntityTO {

    LOCATION("LOCATION"),
    WORK_ORDER("WORK_ORDER"),
    SITE_SURVEY("SITE_SURVEY"),
    EQUIPMENT("EQUIPMENT"),
    USER("USER"),
    CHECKLIST_ITEM("CHECKLIST_ITEM");

    private final String graphqlName;

    ImageEntityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
