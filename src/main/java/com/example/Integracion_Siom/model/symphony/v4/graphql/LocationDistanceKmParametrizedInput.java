package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDistanceKmParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private Double latitude;
    @javax.validation.constraints.NotNull
    private Double longitude;

    public LocationDistanceKmParametrizedInput() {
    }

    public LocationDistanceKmParametrizedInput(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationDistanceKmParametrizedInput latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public LocationDistanceKmParametrizedInput longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        return joiner.toString();
    }

}
