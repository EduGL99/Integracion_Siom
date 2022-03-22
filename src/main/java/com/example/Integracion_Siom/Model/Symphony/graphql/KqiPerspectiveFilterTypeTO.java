package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum KqiPerspectiveFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiPerspectiveFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
