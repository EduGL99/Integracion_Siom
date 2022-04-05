package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddBlockInstanceMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "addBlockInstance";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public AddBlockInstanceMutationRequest() {
    }

    public void setFlowInstanceId(String flowInstanceId) {
        this.input.put("flowInstanceId", flowInstanceId);
    }

    public void setInput(AddBlockInstanceInputTO input) {
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

        private String flowInstanceId;
        private AddBlockInstanceInputTO input;

        public Builder() {
        }

        public Builder setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }

        public Builder setInput(AddBlockInstanceInputTO input) {
            this.input = input;
            return this;
        }


        public AddBlockInstanceMutationRequest build() {
            AddBlockInstanceMutationRequest obj = new AddBlockInstanceMutationRequest();
            obj.setFlowInstanceId(flowInstanceId);
            obj.setInput(input);
            return obj;
        }

    }
}
