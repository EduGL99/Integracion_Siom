package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum FlowInstanceStatusTO {

    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    CANCELED("CANCELED");

    private final String graphqlName;

    private FlowInstanceStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
