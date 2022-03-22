package com.example.Integracion_Siom.Model.Symphony.graphql;


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
