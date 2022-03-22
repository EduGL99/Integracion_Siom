package com.example.Integracion_Siom.Model.Symphony.graphql;


public enum FormulaFilterTypeTO {

    TEXTFORMULA("TEXTFORMULA"),
    STATUS("STATUS");

    private final String graphqlName;

    FormulaFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
