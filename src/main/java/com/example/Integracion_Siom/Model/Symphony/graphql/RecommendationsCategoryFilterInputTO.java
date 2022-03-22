package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationsCategoryFilterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private RecommendationsCategoryFilterTypeTO filterType;
    @javax.validation.constraints.NotNull
    private FilterOperatorTO operator;
    private String stringValue;
    @javax.validation.constraints.NotNull
    private java.util.List<String> idSet;
    private Integer maxDepth = 5;
    @javax.validation.constraints.NotNull
    private java.util.List<String> stringSet;

    public RecommendationsCategoryFilterInputTO() {
    }

    public RecommendationsCategoryFilterInputTO(RecommendationsCategoryFilterTypeTO filterType, FilterOperatorTO operator, String stringValue, java.util.List<String> idSet, Integer maxDepth, java.util.List<String> stringSet) {
        this.filterType = filterType;
        this.operator = operator;
        this.stringValue = stringValue;
        this.idSet = idSet;
        this.maxDepth = maxDepth;
        this.stringSet = stringSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public RecommendationsCategoryFilterTypeTO getFilterType() {
        return filterType;
    }

    public void setFilterType(RecommendationsCategoryFilterTypeTO filterType) {
        this.filterType = filterType;
    }

    public FilterOperatorTO getOperator() {
        return operator;
    }

    public void setOperator(FilterOperatorTO operator) {
        this.operator = operator;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public java.util.List<String> getIdSet() {
        return idSet;
    }

    public void setIdSet(java.util.List<String> idSet) {
        this.idSet = idSet;
    }

    public Integer getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    public java.util.List<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(java.util.List<String> stringSet) {
        this.stringSet = stringSet;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (filterType != null) {
            joiner.add("filterType: " + GraphQLRequestSerializer.getEntry(filterType));
        }
        if (operator != null) {
            joiner.add("operator: " + GraphQLRequestSerializer.getEntry(operator));
        }
        if (stringValue != null) {
            joiner.add("stringValue: " + GraphQLRequestSerializer.getEntry(stringValue));
        }
        if (idSet != null) {
            joiner.add("idSet: " + GraphQLRequestSerializer.getEntry(idSet));
        }
        if (maxDepth != null) {
            joiner.add("maxDepth: " + GraphQLRequestSerializer.getEntry(maxDepth));
        }
        if (stringSet != null) {
            joiner.add("stringSet: " + GraphQLRequestSerializer.getEntry(stringSet));
        }
        return joiner.toString();
    }

    public static class Builder {

        private RecommendationsCategoryFilterTypeTO filterType;
        private FilterOperatorTO operator;
        private String stringValue;
        private java.util.List<String> idSet;
        private Integer maxDepth = 5;
        private java.util.List<String> stringSet;

        public Builder() {
        }

        public Builder setFilterType(RecommendationsCategoryFilterTypeTO filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setOperator(FilterOperatorTO operator) {
            this.operator = operator;
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setIdSet(java.util.List<String> idSet) {
            this.idSet = idSet;
            return this;
        }

        public Builder setMaxDepth(Integer maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }

        public Builder setStringSet(java.util.List<String> stringSet) {
            this.stringSet = stringSet;
            return this;
        }


        public RecommendationsCategoryFilterInputTO build() {
            return new RecommendationsCategoryFilterInputTO(filterType, operator, stringValue, idSet, maxDepth, stringSet);
        }

    }
}
