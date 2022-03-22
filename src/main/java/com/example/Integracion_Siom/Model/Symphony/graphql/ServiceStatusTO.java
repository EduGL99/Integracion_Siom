package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum ServiceStatusTO {

    PENDING("PENDING"),
    IN_SERVICE("IN_SERVICE"),
    MAINTENANCE("MAINTENANCE"),
    DISCONNECTED("DISCONNECTED");

    private final String graphqlName;

    ServiceStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
