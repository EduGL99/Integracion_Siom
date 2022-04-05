package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * operators to filter search by
 */

public enum FilterOperatorTO {

    IS("IS"),
    CONTAINS("CONTAINS"),
    IS_ONE_OF("IS_ONE_OF"),
    IS_NOT_ONE_OF("IS_NOT_ONE_OF"),
    DATE_GREATER_THAN("DATE_GREATER_THAN"),
    DATE_LESS_THAN("DATE_LESS_THAN"),
    DATE_GREATER_OR_EQUAL_THAN("DATE_GREATER_OR_EQUAL_THAN"),
    DATE_LESS_OR_EQUAL_THAN("DATE_LESS_OR_EQUAL_THAN");

    private final String graphqlName;

    private FilterOperatorTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
