package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectConnectionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Integer totalCount;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public ProjectConnectionTO() {
    }

    public ProjectConnectionTO(Integer totalCount, java.util.List<ProjectEdgeTO> edges, PageInfoTO pageInfo) {
        this.totalCount = totalCount;
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public java.util.List<ProjectEdgeTO> getEdges() {
        return edges;
    }

    public void setEdges(java.util.List<ProjectEdgeTO> edges) {
        this.edges = edges;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoTO pageInfo) {
        this.pageInfo = pageInfo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (totalCount != null) {
            joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        }
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Integer totalCount;
        private java.util.List<ProjectEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        public Builder setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder setEdges(java.util.List<ProjectEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public ProjectConnectionTO build() {
            return new ProjectConnectionTO(totalCount, edges, pageInfo);
        }

    }
}
