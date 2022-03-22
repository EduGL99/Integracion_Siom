package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditEquipmentPortTypeMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "editEquipmentPortType";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public EditEquipmentPortTypeMutationRequest() {
    }

    public void setInput(EditEquipmentPortTypeInputTO input) {
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

        private EditEquipmentPortTypeInputTO input;

        public Builder() {
        }

        public Builder setInput(EditEquipmentPortTypeInputTO input) {
            this.input = input;
            return this;
        }


        public EditEquipmentPortTypeMutationRequest build() {
            EditEquipmentPortTypeMutationRequest obj = new EditEquipmentPortTypeMutationRequest();
            obj.setInput(input);
            return obj;
        }

    }
}