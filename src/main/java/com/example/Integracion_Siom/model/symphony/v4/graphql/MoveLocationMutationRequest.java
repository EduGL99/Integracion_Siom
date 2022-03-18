package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveLocationMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "moveLocation";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public MoveLocationMutationRequest() {
    }

    public void setLocationID(String locationID) {
        this.input.put("locationID", locationID);
    }

    public void setParentLocationID(String parentLocationID) {
        this.input.put("parentLocationID", parentLocationID);
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

        private String locationID;
        private String parentLocationID;

        public Builder() {
        }

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setParentLocationID(String parentLocationID) {
            this.parentLocationID = parentLocationID;
            return this;
        }


        public MoveLocationMutationRequest build() {
            MoveLocationMutationRequest obj = new MoveLocationMutationRequest();
            obj.setLocationID(locationID);
            obj.setParentLocationID(parentLocationID);
            return obj;
        }

    }
}
