package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean availableOnly = false;

    public EquipmentPortsParametrizedInput() {
    }

    public EquipmentPortsParametrizedInput(Boolean availableOnly) {
        this.availableOnly = availableOnly;
    }

    public EquipmentPortsParametrizedInput availableOnly(Boolean availableOnly) {
        this.availableOnly = availableOnly;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (availableOnly != null) {
            joiner.add("availableOnly: " + GraphQLRequestSerializer.getEntry(availableOnly));
        }
        return joiner.toString();
    }

}
