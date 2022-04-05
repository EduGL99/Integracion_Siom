package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypeIndexTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String locationTypeID;
    @javax.validation.constraints.NotNull
    private Integer index;

    public LocationTypeIndexTO() {
    }

    public LocationTypeIndexTO(String locationTypeID, Integer index) {
        this.locationTypeID = locationTypeID;
        this.index = index;
    }

    public String getLocationTypeID() {
        return locationTypeID;
    }

    public void setLocationTypeID(String locationTypeID) {
        this.locationTypeID = locationTypeID;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (locationTypeID != null) {
            joiner.add("locationTypeID: " + GraphQLRequestSerializer.getEntry(locationTypeID));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String locationTypeID;
        private Integer index;

        public Builder() {
        }

        public Builder setLocationTypeID(String locationTypeID) {
            this.locationTypeID = locationTypeID;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }


        public LocationTypeIndexTO build() {
            return new LocationTypeIndexTO(locationTypeID, index);
        }

    }
}
