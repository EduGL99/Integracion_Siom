package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum ProjectFilterTypeTO {

    PROJECT_NAME("PROJECT_NAME"),
    PROJECT_OWNED_BY("PROJECT_OWNED_BY"),
    PROJECT_TYPE("PROJECT_TYPE"),
    LOCATION_INST("LOCATION_INST"),
    PROJECT_PRIORITY("PROJECT_PRIORITY"),
    PROPERTY("PROPERTY");

    private final String graphqlName;

    private ProjectFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
