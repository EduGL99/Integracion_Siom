package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerEdgeTO implements java.io.Serializable {

    private CustomerTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public CustomerEdgeTO() {
    }

    public CustomerEdgeTO(CustomerTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * The customer at the end of the edge.
     */
    public CustomerTO getNode() {
        return node;
    }

    /**
     * The customer at the end of the edge.
     */
    public void setNode(CustomerTO node) {
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private CustomerTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The customer at the end of the edge.
         */
        public Builder setNode(CustomerTO node) {
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


        public CustomerEdgeTO build() {
            return new CustomerEdgeTO(node, cursor);
        }

    }
}
