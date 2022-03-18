package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnicianWorkOrderUploadDataMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "technicianWorkOrderUploadData";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public TechnicianWorkOrderUploadDataMutationRequest() {
    }

    public void setInput(TechnicianWorkOrderUploadInputTO input) {
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

        private TechnicianWorkOrderUploadInputTO input;

        public Builder() {
        }

        public Builder setInput(TechnicianWorkOrderUploadInputTO input) {
            this.input = input;
            return this;
        }


        public TechnicianWorkOrderUploadDataMutationRequest build() {
            TechnicianWorkOrderUploadDataMutationRequest obj = new TechnicianWorkOrderUploadDataMutationRequest();
            obj.setInput(input);
            return obj;
        }

    }
}
