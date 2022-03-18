package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarkSiteSurveyNeededMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "markSiteSurveyNeeded";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public MarkSiteSurveyNeededMutationRequest() {
    }

    public void setLocationId(String locationId) {
        this.input.put("locationId", locationId);
    }

    public void setNeeded(Boolean needed) {
        this.input.put("needed", needed);
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

        private String locationId;
        private Boolean needed;

        public Builder() {
        }

        public Builder setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder setNeeded(Boolean needed) {
            this.needed = needed;
            return this;
        }


        public MarkSiteSurveyNeededMutationRequest build() {
            MarkSiteSurveyNeededMutationRequest obj = new MarkSiteSurveyNeededMutationRequest();
            obj.setLocationId(locationId);
            obj.setNeeded(needed);
            return obj;
        }

    }
}
