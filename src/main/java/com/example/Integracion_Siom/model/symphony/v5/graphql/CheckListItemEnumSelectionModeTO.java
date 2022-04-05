package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum CheckListItemEnumSelectionModeTO {

    single("single"),
    multiple("multiple");

    private final String graphqlName;

    private CheckListItemEnumSelectionModeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
