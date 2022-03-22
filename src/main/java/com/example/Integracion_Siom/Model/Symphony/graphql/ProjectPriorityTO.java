package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum ProjectPriorityTO {

    URGENT("URGENT"),
    HIGH("HIGH"),
    MEDIUM("MEDIUM"),
    LOW("LOW"),
    NONE("NONE");

    private final String graphqlName;

    ProjectPriorityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
