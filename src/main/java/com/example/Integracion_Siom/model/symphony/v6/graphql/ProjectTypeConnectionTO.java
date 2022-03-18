package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTypeConnectionTO implements java.io.Serializable {

    private int totalCount;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectTypeEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public ProjectTypeConnectionTO() {
    }

    public ProjectTypeConnectionTO(int totalCount, java.util.List<ProjectTypeEdgeTO> edges, PageInfoTO pageInfo) {
        this.totalCount = totalCount;
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Total count of project types in all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Total count of project types in all pages.
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * A list of project type edges.
     */
    public java.util.List<ProjectTypeEdgeTO> getEdges() {
        return edges;
    }

    /**
     * A list of project type edges.
     */
    public void setEdges(java.util.List<ProjectTypeEdgeTO> edges) {
        this.edges = edges;
    }

    /**
     * Information to aid in pagination.
     */
    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    /**
     * Information to aid in pagination.
     */
    public void setPageInfo(PageInfoTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        return joiner.toString();
    }

    public static class Builder {

        private int totalCount;
        private java.util.List<ProjectTypeEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        /**
         * Total count of project types in all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of project type edges.
         */
        public Builder setEdges(java.util.List<ProjectTypeEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * Information to aid in pagination.
         */
        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public ProjectTypeConnectionTO build() {
            return new ProjectTypeConnectionTO(totalCount, edges, pageInfo);
        }

    }
}
