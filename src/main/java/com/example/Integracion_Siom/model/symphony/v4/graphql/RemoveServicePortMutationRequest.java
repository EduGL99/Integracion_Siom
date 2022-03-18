package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveServicePortMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "removeServicePort";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public RemoveServicePortMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setPortId(String portId) {
        this.input.put("portId", portId);
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

        private String id;
        private String portId;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPortId(String portId) {
            this.portId = portId;
            return this;
        }


        public RemoveServicePortMutationRequest build() {
            RemoveServicePortMutationRequest obj = new RemoveServicePortMutationRequest();
            obj.setId(id);
            obj.setPortId(portId);
            return obj;
        }

    }
}
