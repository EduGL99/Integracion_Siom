package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum ServiceStatusTO {

    PENDING("PENDING"),
    IN_SERVICE("IN_SERVICE"),
    MAINTENANCE("MAINTENANCE"),
    DISCONNECTED("DISCONNECTED");

    private final String graphqlName;

    private ServiceStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
