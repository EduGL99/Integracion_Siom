package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableDefinitionResponseProjection extends GraphQLResponseProjection {

    public VariableDefinitionResponseProjection() {
    }

    public VariableDefinitionResponseProjection key() {
        return key(null);
    }

    public VariableDefinitionResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection name() {
        return name(null);
    }

    public VariableDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection type() {
        return type(null);
    }

    public VariableDefinitionResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection mandatory() {
        return mandatory(null);
    }

    public VariableDefinitionResponseProjection mandatory(String alias) {
        fields.add(new GraphQLResponseField("mandatory").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection multipleValues() {
        return multipleValues(null);
    }

    public VariableDefinitionResponseProjection multipleValues(String alias) {
        fields.add(new GraphQLResponseField("multipleValues").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection choices() {
        return choices(null);
    }

    public VariableDefinitionResponseProjection choices(String alias) {
        fields.add(new GraphQLResponseField("choices").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection defaultValue() {
        return defaultValue(null);
    }

    public VariableDefinitionResponseProjection defaultValue(String alias) {
        fields.add(new GraphQLResponseField("defaultValue").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection usage() {
        return usage(null);
    }

    public VariableDefinitionResponseProjection usage(String alias) {
        fields.add(new GraphQLResponseField("usage").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection nestedVariables(VariableDefinitionResponseProjection subProjection) {
        return nestedVariables((String) null, subProjection);
    }

    public VariableDefinitionResponseProjection nestedVariables(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nestedVariables").alias(alias).projection(subProjection));
        return this;
    }

    public VariableDefinitionResponseProjection nestedVariables(VariableDefinitionNestedVariablesParametrizedInput input, VariableDefinitionResponseProjection subProjection) {
        return nestedVariables(null, input, subProjection);
    }

    public VariableDefinitionResponseProjection nestedVariables(String alias, VariableDefinitionNestedVariablesParametrizedInput input, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nestedVariables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }


}
