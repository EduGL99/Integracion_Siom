package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveEquipmentToPositionMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "moveEquipmentToPosition";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public MoveEquipmentToPositionMutationRequest() {
    }

    public void setParentEquipmentId(String parentEquipmentId) {
        this.input.put("parentEquipmentId", parentEquipmentId);
    }

    public void setPositionDefinitionId(String positionDefinitionId) {
        this.input.put("positionDefinitionId", positionDefinitionId);
    }

    public void setEquipmentId(String equipmentId) {
        this.input.put("equipmentId", equipmentId);
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

        private String parentEquipmentId;
        private String positionDefinitionId;
        private String equipmentId;

        public Builder() {
        }

        public Builder setParentEquipmentId(String parentEquipmentId) {
            this.parentEquipmentId = parentEquipmentId;
            return this;
        }

        public Builder setPositionDefinitionId(String positionDefinitionId) {
            this.positionDefinitionId = positionDefinitionId;
            return this;
        }

        public Builder setEquipmentId(String equipmentId) {
            this.equipmentId = equipmentId;
            return this;
        }


        public MoveEquipmentToPositionMutationRequest build() {
            MoveEquipmentToPositionMutationRequest obj = new MoveEquipmentToPositionMutationRequest();
            obj.setParentEquipmentId(parentEquipmentId);
            obj.setPositionDefinitionId(positionDefinitionId);
            obj.setEquipmentId(equipmentId);
            return obj;
        }

    }
}
