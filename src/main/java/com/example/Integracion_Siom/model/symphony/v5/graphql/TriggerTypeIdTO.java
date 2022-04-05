package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum TriggerTypeIdTO {

    work_order("work_order");

    private final String graphqlName;

    private TriggerTypeIdTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
