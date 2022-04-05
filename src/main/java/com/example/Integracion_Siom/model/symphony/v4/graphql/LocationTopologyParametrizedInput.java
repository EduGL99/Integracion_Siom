package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTopologyParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private Integer depth = 3;

    public LocationTopologyParametrizedInput() {
    }

    public LocationTopologyParametrizedInput(Integer depth) {
        this.depth = depth;
    }

    public LocationTopologyParametrizedInput depth(Integer depth) {
        this.depth = depth;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (depth != null) {
            joiner.add("depth: " + GraphQLRequestSerializer.getEntry(depth));
        }
        return joiner.toString();
    }

}
