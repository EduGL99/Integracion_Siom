package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum ProjectPriorityTO {

    URGENT("URGENT"),
    HIGH("HIGH"),
    MEDIUM("MEDIUM"),
    LOW("LOW"),
    NONE("NONE");

    private final String graphqlName;

    private ProjectPriorityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
