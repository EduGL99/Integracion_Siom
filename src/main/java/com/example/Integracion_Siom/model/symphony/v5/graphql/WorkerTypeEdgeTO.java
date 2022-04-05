package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkerTypeEdgeTO implements java.io.Serializable {

    private WorkerTypeTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public WorkerTypeEdgeTO() {
    }

    public WorkerTypeEdgeTO(WorkerTypeTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * The worker type at the end of the edge.
     */
    public WorkerTypeTO getNode() {
        return node;
    }

    /**
     * The worker type at the end of the edge.
     */
    public void setNode(WorkerTypeTO node) {
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

        private WorkerTypeTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The worker type at the end of the edge.
         */
        public Builder setNode(WorkerTypeTO node) {
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


        public WorkerTypeEdgeTO build() {
            return new WorkerTypeEdgeTO(node, cursor);
        }

    }
}
