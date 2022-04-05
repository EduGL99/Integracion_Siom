package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditServiceMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "editService";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public EditServiceMutationRequest() {
    }

    public void setData(ServiceEditDataTO data) {
        this.input.put("data", data);
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

        private ServiceEditDataTO data;

        public Builder() {
        }

        public Builder setData(ServiceEditDataTO data) {
            this.data = data;
            return this;
        }


        public EditServiceMutationRequest build() {
            EditServiceMutationRequest obj = new EditServiceMutationRequest();
            obj.setData(data);
            return obj;
        }

    }
}
