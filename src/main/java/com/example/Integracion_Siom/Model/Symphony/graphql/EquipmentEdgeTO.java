package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentEdgeTO implements java.io.Serializable {

    private EquipmentTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public EquipmentEdgeTO() {
    }

    public EquipmentEdgeTO(EquipmentTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The equipment at the end of the edge.
     */
    public EquipmentTO getNode() {
        return node;
    }

    /**
     * The equipment at the end of the edge.
     */
    public void setNode(EquipmentTO node) {
        this.node = node;
    }

    /**
     * A cursor for use in pagination.
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * A cursor for use in pagination.
     */
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

    public static class Builder {

        private EquipmentTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The equipment at the end of the edge.
         */
        public Builder setNode(EquipmentTO node) {
            this.node = node;
            return this;
        }

        /**
         * A cursor for use in pagination.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EquipmentEdgeTO build() {
            return new EquipmentEdgeTO(node, cursor);
        }

    }
}
