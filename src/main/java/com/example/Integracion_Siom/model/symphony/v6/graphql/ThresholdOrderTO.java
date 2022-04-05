package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThresholdOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    private ThresholdOrderFieldTO field;

    public ThresholdOrderTO() {
    }

    public ThresholdOrderTO(OrderDirectionTO direction, ThresholdOrderFieldTO field) {
        this.direction = direction;
        this.field = field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public OrderDirectionTO getDirection() {
        return direction;
    }

    public void setDirection(OrderDirectionTO direction) {
        this.direction = direction;
    }

    public ThresholdOrderFieldTO getField() {
        return field;
    }

    public void setField(ThresholdOrderFieldTO field) {
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

    public static class Builder {

        private OrderDirectionTO direction;
        private ThresholdOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(ThresholdOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public ThresholdOrderTO build() {
            return new ThresholdOrderTO(direction, field);
        }

    }
}
