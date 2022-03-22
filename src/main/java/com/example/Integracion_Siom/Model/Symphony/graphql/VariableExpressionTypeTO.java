package com.example.Integracion_Siom.Model.Symphony.graphql;

/**
 * what type variableExpression should we apply
 */

public enum VariableExpressionTypeTO {

    VariableDefinition("VariableDefinition"),
    PropertyTypeDefinition("PropertyTypeDefinition"),
    DecisionDefinition("DecisionDefinition"),
    ChekListItemDefinition("ChekListItemDefinition");

    private final String graphqlName;

    VariableExpressionTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
