package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyTemplateQuestionResponseProjection extends GraphQLResponseProjection {

    public SurveyTemplateQuestionResponseProjection() {
    }

    public SurveyTemplateQuestionResponseProjection id() {
        return id(null);
    }

    public SurveyTemplateQuestionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection questionTitle() {
        return questionTitle(null);
    }

    public SurveyTemplateQuestionResponseProjection questionTitle(String alias) {
        fields.add(new GraphQLResponseField("questionTitle").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection questionDescription() {
        return questionDescription(null);
    }

    public SurveyTemplateQuestionResponseProjection questionDescription(String alias) {
        fields.add(new GraphQLResponseField("questionDescription").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection questionType() {
        return questionType(null);
    }

    public SurveyTemplateQuestionResponseProjection questionType(String alias) {
        fields.add(new GraphQLResponseField("questionType").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection index() {
        return index(null);
    }

    public SurveyTemplateQuestionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }


}
