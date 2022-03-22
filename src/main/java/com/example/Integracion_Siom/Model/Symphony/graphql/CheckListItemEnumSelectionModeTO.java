package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum CheckListItemEnumSelectionModeTO {

    single("single"),
    multiple("multiple");

    private final String graphqlName;

    CheckListItemEnumSelectionModeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
