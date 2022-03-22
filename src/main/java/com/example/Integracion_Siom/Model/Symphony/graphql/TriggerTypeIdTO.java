package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum TriggerTypeIdTO {

    work_order("work_order");

    private final String graphqlName;

    TriggerTypeIdTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
