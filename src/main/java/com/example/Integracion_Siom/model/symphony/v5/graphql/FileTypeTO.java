package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum FileTypeTO {

    IMAGE("IMAGE"),
    FILE("FILE");

    private final String graphqlName;

    private FileTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
