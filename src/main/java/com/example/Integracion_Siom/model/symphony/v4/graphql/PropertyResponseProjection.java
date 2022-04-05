package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropertyResponseProjection extends GraphQLResponseProjection {

    public PropertyResponseProjection() {
    }

    public PropertyResponseProjection id() {
        return id(null);
    }

    public PropertyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PropertyResponseProjection propertyType(PropertyTypeResponseProjection subProjection) {
        return propertyType(null, subProjection);
    }

    public PropertyResponseProjection propertyType(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyType").alias(alias).projection(subProjection));
        return this;
    }

    public PropertyResponseProjection stringValue() {
        return stringValue(null);
    }

    public PropertyResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection intValue() {
        return intValue(null);
    }

    public PropertyResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public PropertyResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection floatValue() {
        return floatValue(null);
    }

    public PropertyResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public PropertyResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public PropertyResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public PropertyResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public PropertyResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection nodeValue(NamedNodeResponseProjection subProjection) {
        return nodeValue(null, subProjection);
    }

    public PropertyResponseProjection nodeValue(String alias, NamedNodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodeValue").alias(alias).projection(subProjection));
        return this;
    }

    public PropertyResponseProjection rawValue() {
        return rawValue(null);
    }

    public PropertyResponseProjection rawValue(String alias) {
        fields.add(new GraphQLResponseField("rawValue").alias(alias));
        return this;
    }


}
