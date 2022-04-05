package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditLocationTypesIndexMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "editLocationTypesIndex";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public EditLocationTypesIndexMutationRequest() {
    }

    public void setLocationTypesIndex(java.util.List<LocationTypeIndexTO> locationTypesIndex) {
        this.input.put("locationTypesIndex", locationTypesIndex);
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

        private java.util.List<LocationTypeIndexTO> locationTypesIndex;

        public Builder() {
        }

        public Builder setLocationTypesIndex(java.util.List<LocationTypeIndexTO> locationTypesIndex) {
            this.locationTypesIndex = locationTypesIndex;
            return this;
        }


        public EditLocationTypesIndexMutationRequest build() {
            EditLocationTypesIndexMutationRequest obj = new EditLocationTypesIndexMutationRequest();
            obj.setLocationTypesIndex(locationTypesIndex);
            return obj;
        }

    }
}
