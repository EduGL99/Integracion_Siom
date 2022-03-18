package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum ExportStatusTO {

    PENDING("PENDING"),
    IN_PROGRESS("IN_PROGRESS"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED");

    private final String graphqlName;

    private ExportStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
