package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * what type variableExpression should we apply
 */

public enum VariableExpressionTypeTO {

    VariableDefinition("VariableDefinition"),
    PropertyTypeDefinition("PropertyTypeDefinition"),
    DecisionDefinition("DecisionDefinition"),
    ChekListItemDefinition("ChekListItemDefinition");

    private final String graphqlName;

    private VariableExpressionTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
