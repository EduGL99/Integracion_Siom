package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyQuestionResponseProjection extends GraphQLResponseProjection {

    public SurveyQuestionResponseProjection() {
    }

    public SurveyQuestionResponseProjection id() {
        return id(null);
    }

    public SurveyQuestionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection formName() {
        return formName(null);
    }

    public SurveyQuestionResponseProjection formName(String alias) {
        fields.add(new GraphQLResponseField("formName").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection formDescription() {
        return formDescription(null);
    }

    public SurveyQuestionResponseProjection formDescription(String alias) {
        fields.add(new GraphQLResponseField("formDescription").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection formIndex() {
        return formIndex(null);
    }

    public SurveyQuestionResponseProjection formIndex(String alias) {
        fields.add(new GraphQLResponseField("formIndex").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection questionFormat() {
        return questionFormat(null);
    }

    public SurveyQuestionResponseProjection questionFormat(String alias) {
        fields.add(new GraphQLResponseField("questionFormat").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection questionText() {
        return questionText(null);
    }

    public SurveyQuestionResponseProjection questionText(String alias) {
        fields.add(new GraphQLResponseField("questionText").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection questionIndex() {
        return questionIndex(null);
    }

    public SurveyQuestionResponseProjection questionIndex(String alias) {
        fields.add(new GraphQLResponseField("questionIndex").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection boolData() {
        return boolData(null);
    }

    public SurveyQuestionResponseProjection boolData(String alias) {
        fields.add(new GraphQLResponseField("boolData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection emailData() {
        return emailData(null);
    }

    public SurveyQuestionResponseProjection emailData(String alias) {
        fields.add(new GraphQLResponseField("emailData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection latitude() {
        return latitude(null);
    }

    public SurveyQuestionResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection longitude() {
        return longitude(null);
    }

    public SurveyQuestionResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection locationAccuracy() {
        return locationAccuracy(null);
    }

    public SurveyQuestionResponseProjection locationAccuracy(String alias) {
        fields.add(new GraphQLResponseField("locationAccuracy").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection altitude() {
        return altitude(null);
    }

    public SurveyQuestionResponseProjection altitude(String alias) {
        fields.add(new GraphQLResponseField("altitude").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection phoneData() {
        return phoneData(null);
    }

    public SurveyQuestionResponseProjection phoneData(String alias) {
        fields.add(new GraphQLResponseField("phoneData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection textData() {
        return textData(null);
    }

    public SurveyQuestionResponseProjection textData(String alias) {
        fields.add(new GraphQLResponseField("textData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection floatData() {
        return floatData(null);
    }

    public SurveyQuestionResponseProjection floatData(String alias) {
        fields.add(new GraphQLResponseField("floatData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection intData() {
        return intData(null);
    }

    public SurveyQuestionResponseProjection intData(String alias) {
        fields.add(new GraphQLResponseField("intData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection dateData() {
        return dateData(null);
    }

    public SurveyQuestionResponseProjection dateData(String alias) {
        fields.add(new GraphQLResponseField("dateData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection photoData(FileResponseProjection subProjection) {
        return photoData(null, subProjection);
    }

    public SurveyQuestionResponseProjection photoData(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("photoData").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyQuestionResponseProjection wifiData(SurveyWiFiScanResponseProjection subProjection) {
        return wifiData(null, subProjection);
    }

    public SurveyQuestionResponseProjection wifiData(String alias, SurveyWiFiScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("wifiData").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyQuestionResponseProjection cellData(SurveyCellScanResponseProjection subProjection) {
        return cellData(null, subProjection);
    }

    public SurveyQuestionResponseProjection cellData(String alias, SurveyCellScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cellData").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyQuestionResponseProjection images(FileResponseProjection subProjection) {
        return images(null, subProjection);
    }

    public SurveyQuestionResponseProjection images(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }


}
