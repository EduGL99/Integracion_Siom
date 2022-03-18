package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class AddServiceEndpointMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "addServiceEndpoint";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public AddServiceEndpointMutationRequest() {
    }

    public AddServiceEndpointMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setInput(AddServiceEndpointInputTO input) {
        this.input.put("input", input);
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
        private AddServiceEndpointInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(AddServiceEndpointInputTO input) {
            this.input = input;
            return this;
        }


        public AddServiceEndpointMutationRequest build() {
            AddServiceEndpointMutationRequest obj = new AddServiceEndpointMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
