package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWiFiScansMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "addWiFiScans";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public AddWiFiScansMutationRequest() {
    }

    public void setData(java.util.List<SurveyWiFiScanDataTO> data) {
        this.input.put("data", data);
    }

    public void setLocationID(String locationID) {
        this.input.put("locationID", locationID);
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

        private java.util.List<SurveyWiFiScanDataTO> data;
        private String locationID;

        public Builder() {
        }

        public Builder setData(java.util.List<SurveyWiFiScanDataTO> data) {
            this.data = data;
            return this;
        }

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }


        public AddWiFiScansMutationRequest build() {
            AddWiFiScansMutationRequest obj = new AddWiFiScansMutationRequest();
            obj.setData(data);
            obj.setLocationID(locationID);
            return obj;
        }

    }
}