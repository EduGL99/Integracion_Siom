package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableDefinitionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private VariableTypeTO type;
    @javax.validation.constraints.NotNull
    private Boolean mandatory;
    @javax.validation.constraints.NotNull
    private Boolean multipleValues;
    @javax.validation.constraints.NotNull
    private java.util.List<String> choices;
    private String defaultValue;
    @javax.validation.constraints.NotNull
    private VariableUsageTO usage;

    public VariableDefinitionTO() {
    }

    public VariableDefinitionTO(String key, String name, VariableTypeTO type, Boolean mandatory, Boolean multipleValues, java.util.List<String> choices, String defaultValue, VariableUsageTO usage) {
        this.key = key;
        this.name = name;
        this.type = type;
        this.mandatory = mandatory;
        this.multipleValues = multipleValues;
        this.choices = choices;
        this.defaultValue = defaultValue;
        this.usage = usage;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableTypeTO getType() {
        return type;
    }

    public void setType(VariableTypeTO type) {
        this.type = type;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Boolean getMultipleValues() {
        return multipleValues;
    }

    public void setMultipleValues(Boolean multipleValues) {
        this.multipleValues = multipleValues;
    }

    public java.util.List<String> getChoices() {
        return choices;
    }

    public void setChoices(java.util.List<String> choices) {
        this.choices = choices;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public VariableUsageTO getUsage() {
        return usage;
    }

    public void setUsage(VariableUsageTO usage) {
        this.usage = usage;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (mandatory != null) {
            joiner.add("mandatory: " + GraphQLRequestSerializer.getEntry(mandatory));
        }
        if (multipleValues != null) {
            joiner.add("multipleValues: " + GraphQLRequestSerializer.getEntry(multipleValues));
        }
        if (choices != null) {
            joiner.add("choices: " + GraphQLRequestSerializer.getEntry(choices));
        }
        if (defaultValue != null) {
            joiner.add("defaultValue: " + GraphQLRequestSerializer.getEntry(defaultValue));
        }
        if (usage != null) {
            joiner.add("usage: " + GraphQLRequestSerializer.getEntry(usage));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String key;
        private String name;
        private VariableTypeTO type;
        private Boolean mandatory;
        private Boolean multipleValues;
        private java.util.List<String> choices;
        private String defaultValue;
        private VariableUsageTO usage;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(VariableTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }

        public Builder setMultipleValues(Boolean multipleValues) {
            this.multipleValues = multipleValues;
            return this;
        }

        public Builder setChoices(java.util.List<String> choices) {
            this.choices = choices;
            return this;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setUsage(VariableUsageTO usage) {
            this.usage = usage;
            return this;
        }


        public VariableDefinitionTO build() {
            return new VariableDefinitionTO(key, name, type, mandatory, multipleValues, choices, defaultValue, usage);
        }

    }
}
