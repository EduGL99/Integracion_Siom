package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PossiblePropertiesQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "possibleProperties";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public PossiblePropertiesQueryRequest() {
    }

    public void setEntityType(PropertyEntityTO entityType) {
        this.input.put("entityType", entityType);
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

        private PropertyEntityTO entityType;

        public Builder() {
        }

        public Builder setEntityType(PropertyEntityTO entityType) {
            this.entityType = entityType;
            return this;
        }


        public PossiblePropertiesQueryRequest build() {
            PossiblePropertiesQueryRequest obj = new PossiblePropertiesQueryRequest();
            obj.setEntityType(entityType);
            return obj;
        }

    }
}
