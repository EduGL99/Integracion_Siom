package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityFilterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Integer limit;
    @javax.validation.constraints.NotNull
    private OrderDirectionTO orderDirection;
    @javax.validation.constraints.NotNull
    private ActivityFieldTO activityType;

    public ActivityFilterInputTO() {
    }

    public ActivityFilterInputTO(Integer limit, OrderDirectionTO orderDirection, ActivityFieldTO activityType) {
        this.limit = limit;
        this.orderDirection = orderDirection;
        this.activityType = activityType;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public OrderDirectionTO getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(OrderDirectionTO orderDirection) {
        this.orderDirection = orderDirection;
    }

    public ActivityFieldTO getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityFieldTO activityType) {
        this.activityType = activityType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (orderDirection != null) {
            joiner.add("orderDirection: " + GraphQLRequestSerializer.getEntry(orderDirection));
        }
        if (activityType != null) {
            joiner.add("activityType: " + GraphQLRequestSerializer.getEntry(activityType));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Integer limit;
        private OrderDirectionTO orderDirection;
        private ActivityFieldTO activityType;

        public Builder() {
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setOrderDirection(OrderDirectionTO orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        public Builder setActivityType(ActivityFieldTO activityType) {
            this.activityType = activityType;
            return this;
        }


        public ActivityFilterInputTO build() {
            return new ActivityFilterInputTO(limit, orderDirection, activityType);
        }

    }
}
