package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NearestSitesQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "nearestSites";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public NearestSitesQueryRequest() {
    }

    public void setLatitude(Double latitude) {
        this.input.put("latitude", latitude);
    }

    public void setLongitude(Double longitude) {
        this.input.put("longitude", longitude);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
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

        private Double latitude;
        private Double longitude;
        private Integer first = 10;

        public Builder() {
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }


        public NearestSitesQueryRequest build() {
            NearestSitesQueryRequest obj = new NearestSitesQueryRequest();
            obj.setLatitude(latitude);
            obj.setLongitude(longitude);
            obj.setFirst(first);
            return obj;
        }

    }
}
