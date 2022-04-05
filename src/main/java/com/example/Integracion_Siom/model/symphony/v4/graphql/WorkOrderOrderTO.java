package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    private WorkOrderOrderFieldTO field;

    public WorkOrderOrderTO() {
    }

    public WorkOrderOrderTO(OrderDirectionTO direction, WorkOrderOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public void setDirection(OrderDirectionTO direction) {
        this.direction = direction;
    }

    public WorkOrderOrderFieldTO getField() {
        return field;
    }

    public void setField(WorkOrderOrderFieldTO field) {
        this.field = field;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (direction != null) {
            joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction));
        }
        if (field != null) {
            joiner.add("field: " + GraphQLRequestSerializer.getEntry(field));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private OrderDirectionTO direction;
        private WorkOrderOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(WorkOrderOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public WorkOrderOrderTO build() {
            return new WorkOrderOrderTO(direction, field);
        }

    }
}
