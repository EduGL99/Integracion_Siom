package com.example.Integracion_Siom.model.symphony.v6.graphql;


public enum EventSeverityFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    EventSeverityFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
