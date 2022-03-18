package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTypeConnectionTO implements java.io.Serializable {

    private int totalCount;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTypeEdgeTO> edges;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;

    public EquipmentTypeConnectionTO() {
    }

    public EquipmentTypeConnectionTO(int totalCount, java.util.List<EquipmentTypeEdgeTO> edges, PageInfoTO pageInfo) {
        this.totalCount = totalCount;
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    /**
     * Total count of equipment types in all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Total count of equipment types in all pages.
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * A list of equipment type edges.
     */
    public java.util.List<EquipmentTypeEdgeTO> getEdges() {
        return edges;
    }

    /**
     * A list of equipment type edges.
     */
    public void setEdges(java.util.List<EquipmentTypeEdgeTO> edges) {
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private int totalCount;
        private java.util.List<EquipmentTypeEdgeTO> edges;
        private PageInfoTO pageInfo;

        public Builder() {
        }

        /**
         * Total count of equipment types in all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of equipment type edges.
         */
        public Builder setEdges(java.util.List<EquipmentTypeEdgeTO> edges) {
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


        public EquipmentTypeConnectionTO build() {
            return new EquipmentTypeConnectionTO(totalCount, edges, pageInfo);
        }

    }
}
