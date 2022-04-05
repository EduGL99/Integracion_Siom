package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<WorkOrderTO> workOrders;
    @javax.validation.constraints.NotNull
    private Integer count;

    public WorkOrderSearchResultTO() {
    }

    public WorkOrderSearchResultTO(java.util.List<WorkOrderTO> workOrders, Integer count) {
        this.workOrders = workOrders;
        this.count = count;
    }

    public java.util.List<WorkOrderTO> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
        this.workOrders = workOrders;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (workOrders != null) {
            joiner.add("workOrders: " + GraphQLRequestSerializer.getEntry(workOrders));
        }
        if (count != null) {
            joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private java.util.List<WorkOrderTO> workOrders;
        private Integer count;

        public Builder() {
        }

        public Builder setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
            this.workOrders = workOrders;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public WorkOrderSearchResultTO build() {
            return new WorkOrderSearchResultTO(workOrders, count);
        }

    }
}
