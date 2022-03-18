package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportFiltersQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "reportFilters";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public ReportFiltersQueryRequest() {
    }

    public void setEntity(FilterEntityTO entity) {
        this.input.put("entity", entity);
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
        return null;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private FilterEntityTO entity;

        public Builder() {
        }

        public Builder setEntity(FilterEntityTO entity) {
            this.entity = entity;
            return this;
        }


        public ReportFiltersQueryRequest build() {
            ReportFiltersQueryRequest obj = new ReportFiltersQueryRequest();
            obj.setEntity(entity);
            return obj;
        }

    }
}
