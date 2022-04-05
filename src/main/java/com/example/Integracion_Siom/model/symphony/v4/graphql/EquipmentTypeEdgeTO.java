package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTypeEdgeTO implements java.io.Serializable {

    private EquipmentTypeTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public EquipmentTypeEdgeTO() {
    }

    public EquipmentTypeEdgeTO(EquipmentTypeTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public EquipmentTypeTO getNode() {
        return node;
    }

    public void setNode(EquipmentTypeTO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private EquipmentTypeTO node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(EquipmentTypeTO node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EquipmentTypeEdgeTO build() {
            return new EquipmentTypeEdgeTO(node, cursor);
        }

    }
}
