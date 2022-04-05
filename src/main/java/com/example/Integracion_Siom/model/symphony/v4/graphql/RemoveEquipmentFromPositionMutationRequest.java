package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveEquipmentFromPositionMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "removeEquipmentFromPosition";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public RemoveEquipmentFromPositionMutationRequest() {
    }

    public void setPositionId(String positionId) {
        this.input.put("positionId", positionId);
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

        private String positionId;
        private String workOrderId;

        public Builder() {
        }

        public Builder setPositionId(String positionId) {
            this.positionId = positionId;
            return this;
        }

        public Builder setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }


        public RemoveEquipmentFromPositionMutationRequest build() {
            RemoveEquipmentFromPositionMutationRequest obj = new RemoveEquipmentFromPositionMutationRequest();
            obj.setPositionId(positionId);
            obj.setWorkOrderId(workOrderId);
            return obj;
        }

    }
}
