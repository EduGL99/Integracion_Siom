package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class FlowDraftsQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "flowDrafts";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public FlowDraftsQueryRequest() {
    }

    public FlowDraftsQueryRequest(String alias) {
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

    public void setName(String name) {
        this.input.put("name", name);
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
        private String name;

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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public FlowDraftsQueryRequest build() {
            FlowDraftsQueryRequest obj = new FlowDraftsQueryRequest($alias);
            obj.setAfter(after);
            obj.setFirst(first);
            obj.setBefore(before);
            obj.setLast(last);
            obj.setName(name);
            return obj;
        }

    }
}
