package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum SurveyStatusTO {

    PLANNED("PLANNED"),
    INPROGRESS("INPROGRESS"),
    COMPLETED("COMPLETED");

    private final String graphqlName;

    private SurveyStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
