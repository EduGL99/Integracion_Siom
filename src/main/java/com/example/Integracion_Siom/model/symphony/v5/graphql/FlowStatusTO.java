package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum FlowStatusTO {

    PUBLISHED("PUBLISHED"),
    UNPUBLISHED("UNPUBLISHED"),
    ARCHIVED("ARCHIVED");

    private final String graphqlName;

    private FlowStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
