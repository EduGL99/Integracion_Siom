package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectsQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "projects";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public ProjectsQueryRequest() {
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

    public void setOrderBy(ProjectOrderTO orderBy) {
        this.input.put("orderBy", orderBy);
    }

    public void setFilterBy(java.util.List<ProjectFilterInputTO> filterBy) {
        this.input.put("filterBy", filterBy);
    }

    public void setPropertyValue(String propertyValue) {
        this.input.put("propertyValue", propertyValue);
    }

    public void setPropertyOrder(String propertyOrder) {
        this.input.put("propertyOrder", propertyOrder);
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
        return null;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String after;
        private Integer first;
        private String before;
        private Integer last;
        private ProjectOrderTO orderBy;
        private java.util.List<ProjectFilterInputTO> filterBy;
        private String propertyValue;
        private String propertyOrder;

        public Builder() {
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

        public Builder setOrderBy(ProjectOrderTO orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setFilterBy(java.util.List<ProjectFilterInputTO> filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        public Builder setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }

        public Builder setPropertyOrder(String propertyOrder) {
            this.propertyOrder = propertyOrder;
            return this;
        }


        public ProjectsQueryRequest build() {
            ProjectsQueryRequest obj = new ProjectsQueryRequest();
            obj.setAfter(after);
            obj.setFirst(first);
            obj.setBefore(before);
            obj.setLast(last);
            obj.setOrderBy(orderBy);
            obj.setFilterBy(filterBy);
            obj.setPropertyValue(propertyValue);
            obj.setPropertyOrder(propertyOrder);
            return obj;
        }

    }
}
