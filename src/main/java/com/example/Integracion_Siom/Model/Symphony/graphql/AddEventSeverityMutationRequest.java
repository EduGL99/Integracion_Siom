package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class AddEventSeverityMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "addEventSeverity";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public AddEventSeverityMutationRequest() {
    }

    public AddEventSeverityMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
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

    public void setInput(AddEventSeverityInputTO input) {
        this.input.put("input", input);
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String $alias;
        private AddEventSeverityInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(AddEventSeverityInputTO input) {
            this.input = input;
            return this;
        }


        public AddEventSeverityMutationRequest build() {
            AddEventSeverityMutationRequest obj = new AddEventSeverityMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
