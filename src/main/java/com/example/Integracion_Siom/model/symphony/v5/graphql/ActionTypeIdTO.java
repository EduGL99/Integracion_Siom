package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum ActionTypeIdTO {

    work_order("work_order"),
    update_inventory("update_inventory"),
    update_workforce("update_workforce"),
    worker("worker");

    private final String graphqlName;

    private ActionTypeIdTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
