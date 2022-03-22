package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class ProjectChangedSubscriptionRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "projectChanged";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.SUBSCRIPTION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public ProjectChangedSubscriptionRequest() {
    }

    public ProjectChangedSubscriptionRequest(String alias) {
        this.alias = alias;
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

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }


        public ProjectChangedSubscriptionRequest build() {
            ProjectChangedSubscriptionRequest obj = new ProjectChangedSubscriptionRequest($alias);
            return obj;
        }

    }
}