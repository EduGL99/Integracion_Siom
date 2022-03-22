package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum ActionTypeIdTO {

    work_order("work_order"),
    update_inventory("update_inventory"),
    update_workforce("update_workforce"),
    worker("worker");

    private final String graphqlName;

    ActionTypeIdTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
