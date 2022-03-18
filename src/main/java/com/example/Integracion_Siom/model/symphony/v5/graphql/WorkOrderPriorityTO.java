package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * Work Order priority
 */

public enum WorkOrderPriorityTO {

    URGENT("URGENT"),
    HIGH("HIGH"),
    MEDIUM("MEDIUM"),
    LOW("LOW"),
    NONE("NONE");

    private final String graphqlName;

    private WorkOrderPriorityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
