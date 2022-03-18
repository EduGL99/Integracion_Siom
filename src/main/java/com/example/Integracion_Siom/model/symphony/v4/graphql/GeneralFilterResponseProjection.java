package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralFilterResponseProjection extends GraphQLResponseProjection {

    public GeneralFilterResponseProjection() {
    }

    public GeneralFilterResponseProjection filterType() {
        return filterType(null);
    }

    public GeneralFilterResponseProjection filterType(String alias) {
        fields.add(new GraphQLResponseField("filterType").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection key() {
        return key(null);
    }

    public GeneralFilterResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection operator() {
        return operator(null);
    }

    public GeneralFilterResponseProjection operator(String alias) {
        fields.add(new GraphQLResponseField("operator").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection stringValue() {
        return stringValue(null);
    }

    public GeneralFilterResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection idSet() {
        return idSet(null);
    }

    public GeneralFilterResponseProjection idSet(String alias) {
        fields.add(new GraphQLResponseField("idSet").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection stringSet() {
        return stringSet(null);
    }

    public GeneralFilterResponseProjection stringSet(String alias) {
        fields.add(new GraphQLResponseField("stringSet").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection boolValue() {
        return boolValue(null);
    }

    public GeneralFilterResponseProjection boolValue(String alias) {
        fields.add(new GraphQLResponseField("boolValue").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection propertyValue(PropertyTypeResponseProjection subProjection) {
        return propertyValue(null, subProjection);
    }

    public GeneralFilterResponseProjection propertyValue(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyValue").alias(alias).projection(subProjection));
        return this;
    }


}
