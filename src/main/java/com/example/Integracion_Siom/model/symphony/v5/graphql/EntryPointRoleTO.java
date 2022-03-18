package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum EntryPointRoleTO {

    DEFAULT("DEFAULT");

    private final String graphqlName;

    private EntryPointRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
