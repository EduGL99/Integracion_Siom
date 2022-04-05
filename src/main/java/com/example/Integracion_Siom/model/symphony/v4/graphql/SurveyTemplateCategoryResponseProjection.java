package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyTemplateCategoryResponseProjection extends GraphQLResponseProjection {

    public SurveyTemplateCategoryResponseProjection() {
    }

    public SurveyTemplateCategoryResponseProjection id() {
        return id(null);
    }

    public SurveyTemplateCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyTemplateCategoryResponseProjection categoryTitle() {
        return categoryTitle(null);
    }

    public SurveyTemplateCategoryResponseProjection categoryTitle(String alias) {
        fields.add(new GraphQLResponseField("categoryTitle").alias(alias));
        return this;
    }

    public SurveyTemplateCategoryResponseProjection categoryDescription() {
        return categoryDescription(null);
    }

    public SurveyTemplateCategoryResponseProjection categoryDescription(String alias) {
        fields.add(new GraphQLResponseField("categoryDescription").alias(alias));
        return this;
    }

    public SurveyTemplateCategoryResponseProjection surveyTemplateQuestions(SurveyTemplateQuestionResponseProjection subProjection) {
        return surveyTemplateQuestions(null, subProjection);
    }

    public SurveyTemplateCategoryResponseProjection surveyTemplateQuestions(String alias, SurveyTemplateQuestionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("surveyTemplateQuestions").alias(alias).projection(subProjection));
        return this;
    }


}
