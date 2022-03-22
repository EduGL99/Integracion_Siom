package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KqiTargetOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    private KqiTargetOrderFieldTO field;

    public KqiTargetOrderTO() {
    }

    public KqiTargetOrderTO(OrderDirectionTO direction, KqiTargetOrderFieldTO field) {
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

    public KqiTargetOrderFieldTO getField() {
        return field;
    }

    public void setField(KqiTargetOrderFieldTO field) {
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
        private KqiTargetOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(KqiTargetOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public KqiTargetOrderTO build() {
            return new KqiTargetOrderTO(direction, field);
        }

    }
}
