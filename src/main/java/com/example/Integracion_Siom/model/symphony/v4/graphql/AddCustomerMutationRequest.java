package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCustomerMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "addCustomer";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public AddCustomerMutationRequest() {
    }

    public void setInput(AddCustomerInputTO input) {
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

        private AddCustomerInputTO input;

        public Builder() {
        }

        public Builder setInput(AddCustomerInputTO input) {
            this.input = input;
            return this;
        }


        public AddCustomerMutationRequest build() {
            AddCustomerMutationRequest obj = new AddCustomerMutationRequest();
            obj.setInput(input);
            return obj;
        }

    }
}
