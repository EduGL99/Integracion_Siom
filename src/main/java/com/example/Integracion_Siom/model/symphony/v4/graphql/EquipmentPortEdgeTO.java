package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortEdgeTO implements java.io.Serializable {

    private EquipmentPortTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public EquipmentPortEdgeTO() {
    }

    public EquipmentPortEdgeTO(EquipmentPortTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public EquipmentPortTO getNode() {
        return node;
    }

    public void setNode(EquipmentPortTO node) {
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

        private EquipmentPortTO node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(EquipmentPortTO node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EquipmentPortEdgeTO build() {
            return new EquipmentPortEdgeTO(node, cursor);
        }

    }
}
