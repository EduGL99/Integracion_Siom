package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableValueInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String variableDefinitionKey;
    @javax.validation.constraints.NotNull
    private String value;

    public VariableValueInputTO() {
    }

    public VariableValueInputTO(String variableDefinitionKey, String value) {
        this.variableDefinitionKey = variableDefinitionKey;
        this.value = value;
    }

    public String getVariableDefinitionKey() {
        return variableDefinitionKey;
    }

    public void setVariableDefinitionKey(String variableDefinitionKey) {
        this.variableDefinitionKey = variableDefinitionKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (variableDefinitionKey != null) {
            joiner.add("variableDefinitionKey: " + GraphQLRequestSerializer.getEntry(variableDefinitionKey));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String variableDefinitionKey;
        private String value;

        public Builder() {
        }

        public Builder setVariableDefinitionKey(String variableDefinitionKey) {
            this.variableDefinitionKey = variableDefinitionKey;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public VariableValueInputTO build() {
            return new VariableValueInputTO(variableDefinitionKey, value);
        }

    }
}
