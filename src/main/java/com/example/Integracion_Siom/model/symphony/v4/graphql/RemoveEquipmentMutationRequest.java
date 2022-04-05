package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveEquipmentMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "removeEquipment";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public RemoveEquipmentMutationRequest() {
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setWorkOrderId(String workOrderId) {
        this.input.put("workOrderId", workOrderId);
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
        private String workOrderId;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }


        public RemoveEquipmentMutationRequest build() {
            RemoveEquipmentMutationRequest obj = new RemoveEquipmentMutationRequest();
            obj.setId(id);
            obj.setWorkOrderId(workOrderId);
            return obj;
        }

    }
}
