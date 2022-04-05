package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyResponseProjection extends GraphQLResponseProjection {

    public SurveyResponseProjection() {
    }

    public SurveyResponseProjection id() {
        return id(null);
    }

    public SurveyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyResponseProjection name() {
        return name(null);
    }

    public SurveyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SurveyResponseProjection ownerName() {
        return ownerName(null);
    }

    public SurveyResponseProjection ownerName(String alias) {
        fields.add(new GraphQLResponseField("ownerName").alias(alias));
        return this;
    }

    public SurveyResponseProjection creationTimestamp() {
        return creationTimestamp(null);
    }

    public SurveyResponseProjection creationTimestamp(String alias) {
        fields.add(new GraphQLResponseField("creationTimestamp").alias(alias));
        return this;
    }

    public SurveyResponseProjection completionTimestamp() {
        return completionTimestamp(null);
    }

    public SurveyResponseProjection completionTimestamp(String alias) {
        fields.add(new GraphQLResponseField("completionTimestamp").alias(alias));
        return this;
    }

    public SurveyResponseProjection locationID() {
        return locationID(null);
    }

    public SurveyResponseProjection locationID(String alias) {
        fields.add(new GraphQLResponseField("locationID").alias(alias));
        return this;
    }

    public SurveyResponseProjection sourceFile(FileResponseProjection subProjection) {
        return sourceFile(null, subProjection);
    }

    public SurveyResponseProjection sourceFile(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sourceFile").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyResponseProjection surveyResponses(SurveyQuestionResponseProjection subProjection) {
        return surveyResponses(null, subProjection);
    }

    public SurveyResponseProjection surveyResponses(String alias, SurveyQuestionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("surveyResponses").alias(alias).projection(subProjection));
        return this;
    }


}
