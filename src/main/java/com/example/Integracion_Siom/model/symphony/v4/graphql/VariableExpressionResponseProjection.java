package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableExpressionResponseProjection extends GraphQLResponseProjection {

    public VariableExpressionResponseProjection() {
    }

    public VariableExpressionResponseProjection type() {
        return type(null);
    }

    public VariableExpressionResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public VariableExpressionResponseProjection variableDefinition(VariableDefinitionResponseProjection subProjection) {
        return variableDefinition(null, subProjection);
    }

    public VariableExpressionResponseProjection variableDefinition(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variableDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public VariableExpressionResponseProjection propertyTypeDefinition(PropertyTypeResponseProjection subProjection) {
        return propertyTypeDefinition(null, subProjection);
    }

    public VariableExpressionResponseProjection propertyTypeDefinition(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypeDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public VariableExpressionResponseProjection expression() {
        return expression(null);
    }

    public VariableExpressionResponseProjection expression(String alias) {
        fields.add(new GraphQLResponseField("expression").alias(alias));
        return this;
    }

    public VariableExpressionResponseProjection blockVariables(BlockVariableResponseProjection subProjection) {
        return blockVariables(null, subProjection);
    }

    public VariableExpressionResponseProjection blockVariables(String alias, BlockVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blockVariables").alias(alias).projection(subProjection));
        return this;
    }


}
