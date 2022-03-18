package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<LocationTO> locations;
    @javax.validation.constraints.NotNull
    private Integer count;

    public LocationSearchResultTO() {
    }

    public LocationSearchResultTO(java.util.List<LocationTO> locations, Integer count) {
        this.locations = locations;
        this.count = count;
    }

    public java.util.List<LocationTO> getLocations() {
        return locations;
    }

    public void setLocations(java.util.List<LocationTO> locations) {
        this.locations = locations;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (locations != null) {
            joiner.add("locations: " + GraphQLRequestSerializer.getEntry(locations));
        }
        if (count != null) {
            joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private java.util.List<LocationTO> locations;
        private Integer count;

        public Builder() {
        }

        public Builder setLocations(java.util.List<LocationTO> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public LocationSearchResultTO build() {
            return new LocationSearchResultTO(locations, count);
        }

    }
}
