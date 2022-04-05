package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypeResponseProjection extends GraphQLResponseProjection {

    public LocationTypeResponseProjection() {
    }

    public LocationTypeResponseProjection id() {
        return id(null);
    }

    public LocationTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection name() {
        return name(null);
    }

    public LocationTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection mapType() {
        return mapType(null);
    }

    public LocationTypeResponseProjection mapType(String alias) {
        fields.add(new GraphQLResponseField("mapType").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection isSite() {
        return isSite(null);
    }

    public LocationTypeResponseProjection isSite(String alias) {
        fields.add(new GraphQLResponseField("isSite").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection index() {
        return index(null);
    }

    public LocationTypeResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection mapZoomLevel() {
        return mapZoomLevel(null);
    }

    public LocationTypeResponseProjection mapZoomLevel(String alias) {
        fields.add(new GraphQLResponseField("mapZoomLevel").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public LocationTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection numberOfLocations() {
        return numberOfLocations(null);
    }

    public LocationTypeResponseProjection numberOfLocations(String alias) {
        fields.add(new GraphQLResponseField("numberOfLocations").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection locations(LocationConnectionResponseProjection subProjection) {
        return locations((String) null, subProjection);
    }

    public LocationTypeResponseProjection locations(String alias, LocationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locations").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection locations(LocationTypeLocationsParametrizedInput input, LocationConnectionResponseProjection subProjection) {
        return locations(null, input, subProjection);
    }

    public LocationTypeResponseProjection locations(String alias, LocationTypeLocationsParametrizedInput input, LocationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locations").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection surveyTemplateCategories(SurveyTemplateCategoryResponseProjection subProjection) {
        return surveyTemplateCategories(null, subProjection);
    }

    public LocationTypeResponseProjection surveyTemplateCategories(String alias, SurveyTemplateCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("surveyTemplateCategories").alias(alias).projection(subProjection));
        return this;
    }


}
