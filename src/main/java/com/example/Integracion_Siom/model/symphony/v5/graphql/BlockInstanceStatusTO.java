package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum BlockInstanceStatusTO {

    PENDING("PENDING"),
    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    WAITING("WAITING");

    private final String graphqlName;

    private BlockInstanceStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
