package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum AlarmStatusFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    AlarmStatusFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
