package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum EntryPointRoleTO {

    DEFAULT("DEFAULT");

    private final String graphqlName;

    EntryPointRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
