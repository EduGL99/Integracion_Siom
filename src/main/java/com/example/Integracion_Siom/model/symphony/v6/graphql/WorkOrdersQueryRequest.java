package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;

/**
 * A list of work orders.
 */

public class WorkOrdersQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "workOrders";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public WorkOrdersQueryRequest() {
    }

    public WorkOrdersQueryRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setOrderBy(WorkOrderOrderTO orderBy) {
        this.input.put("orderBy", orderBy);
    }

    public void setFilterBy(List<WorkOrderFilterInputTO> filterBy) {
        this.input.put("filterBy", filterBy);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String $alias;
        private String after;
        private Integer first;
        private String before;
        private Integer last;
        private WorkOrderOrderTO orderBy;
        private List<WorkOrderFilterInputTO> filterBy;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setOrderBy(WorkOrderOrderTO orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setFilterBy(List<WorkOrderFilterInputTO> filterBy) {
            this.filterBy = filterBy;
            return this;
        }


        public WorkOrdersQueryRequest build() {
            WorkOrdersQueryRequest obj = new WorkOrdersQueryRequest($alias);
            obj.setAfter(after);
            obj.setFirst(first);
            obj.setBefore(before);
            obj.setLast(last);
            obj.setOrderBy(orderBy);
            obj.setFilterBy(filterBy);
            return obj;
        }

    }
}