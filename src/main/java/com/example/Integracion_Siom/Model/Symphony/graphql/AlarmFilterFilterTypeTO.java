package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum AlarmFilterFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    AlarmFilterFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
