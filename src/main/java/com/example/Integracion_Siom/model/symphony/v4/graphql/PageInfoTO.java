package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageInfoTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Boolean hasNextPage;
    @javax.validation.constraints.NotNull
    private Boolean hasPreviousPage;
    private String startCursor;
    private String endCursor;

    public PageInfoTO() {
    }

    public PageInfoTO(Boolean hasNextPage, Boolean hasPreviousPage, String startCursor, String endCursor) {
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.startCursor = startCursor;
        this.endCursor = endCursor;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public String getStartCursor() {
        return startCursor;
    }

    public void setStartCursor(String startCursor) {
        this.startCursor = startCursor;
    }

    public String getEndCursor() {
        return endCursor;
    }

    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (hasNextPage != null) {
            joiner.add("hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage));
        }
        if (hasPreviousPage != null) {
            joiner.add("hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage));
        }
        if (startCursor != null) {
            joiner.add("startCursor: " + GraphQLRequestSerializer.getEntry(startCursor));
        }
        if (endCursor != null) {
            joiner.add("endCursor: " + GraphQLRequestSerializer.getEntry(endCursor));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Boolean hasNextPage;
        private Boolean hasPreviousPage;
        private String startCursor;
        private String endCursor;

        public Builder() {
        }

        public Builder setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        public Builder setHasPreviousPage(Boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        public Builder setStartCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }

        public Builder setEndCursor(String endCursor) {
            this.endCursor = endCursor;
            return this;
        }


        public PageInfoTO build() {
            return new PageInfoTO(hasNextPage, hasPreviousPage, startCursor, endCursor);
        }

    }
}
