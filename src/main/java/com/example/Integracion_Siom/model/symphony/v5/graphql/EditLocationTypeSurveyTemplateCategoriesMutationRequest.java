package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class EditLocationTypeSurveyTemplateCategoriesMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "editLocationTypeSurveyTemplateCategories";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public EditLocationTypeSurveyTemplateCategoriesMutationRequest() {
    }

    public EditLocationTypeSurveyTemplateCategoriesMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setSurveyTemplateCategories(List<SurveyTemplateCategoryInputTO> surveyTemplateCategories) {
        this.input.put("surveyTemplateCategories", surveyTemplateCategories);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String $alias;
        private String id;
        private List<SurveyTemplateCategoryInputTO> surveyTemplateCategories;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSurveyTemplateCategories(List<SurveyTemplateCategoryInputTO> surveyTemplateCategories) {
            this.surveyTemplateCategories = surveyTemplateCategories;
            return this;
        }


        public EditLocationTypeSurveyTemplateCategoriesMutationRequest build() {
            EditLocationTypeSurveyTemplateCategoriesMutationRequest obj = new EditLocationTypeSurveyTemplateCategoriesMutationRequest($alias);
            obj.setId(id);
            obj.setSurveyTemplateCategories(surveyTemplateCategories);
            return obj;
        }

    }
}
