package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KqiTemporalFrequencyOrderTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private OrderDirectionTO direction;
    private KqiTemporalFrequencyOrderFieldTO field;

    public KqiTemporalFrequencyOrderTO() {
    }

    public KqiTemporalFrequencyOrderTO(OrderDirectionTO direction, KqiTemporalFrequencyOrderFieldTO field) {
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

    public KqiTemporalFrequencyOrderFieldTO getField() {
        return field;
    }

    public void setField(KqiTemporalFrequencyOrderFieldTO field) {
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
        private KqiTemporalFrequencyOrderFieldTO field;

        public Builder() {
        }

        public Builder setDirection(OrderDirectionTO direction) {
            this.direction = direction;
            return this;
        }

        public Builder setField(KqiTemporalFrequencyOrderFieldTO field) {
            this.field = field;
            return this;
        }


        public KqiTemporalFrequencyOrderTO build() {
            return new KqiTemporalFrequencyOrderTO(direction, field);
        }

    }
}
