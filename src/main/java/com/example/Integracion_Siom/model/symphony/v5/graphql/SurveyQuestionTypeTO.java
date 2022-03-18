package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum SurveyQuestionTypeTO {

    BOOL("BOOL"),
    EMAIL("EMAIL"),
    COORDS("COORDS"),
    PHONE("PHONE"),
    TEXT("TEXT"),
    TEXTAREA("TEXTAREA"),
    PHOTO("PHOTO"),
    WIFI("WIFI"),
    CELLULAR("CELLULAR"),
    FLOAT("FLOAT"),
    INTEGER("INTEGER"),
    DATE("DATE");

    private final String graphqlName;

    private SurveyQuestionTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
