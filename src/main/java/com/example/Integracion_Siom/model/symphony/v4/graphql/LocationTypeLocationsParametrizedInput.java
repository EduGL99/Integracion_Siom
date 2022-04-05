package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypeLocationsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean enforceHasLatLong = false;

    public LocationTypeLocationsParametrizedInput() {
    }

    public LocationTypeLocationsParametrizedInput(Boolean enforceHasLatLong) {
        this.enforceHasLatLong = enforceHasLatLong;
    }

    public LocationTypeLocationsParametrizedInput enforceHasLatLong(Boolean enforceHasLatLong) {
        this.enforceHasLatLong = enforceHasLatLong;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (enforceHasLatLong != null) {
            joiner.add("enforceHasLatLong: " + GraphQLRequestSerializer.getEntry(enforceHasLatLong));
        }
        return joiner.toString();
    }

}
