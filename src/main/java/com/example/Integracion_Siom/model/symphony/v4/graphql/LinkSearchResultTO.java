package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<LinkTO> links;
    @javax.validation.constraints.NotNull
    private Integer count;

    public LinkSearchResultTO() {
    }

    public LinkSearchResultTO(java.util.List<LinkTO> links, Integer count) {
        this.links = links;
        this.count = count;
    }

    public java.util.List<LinkTO> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<LinkTO> links) {
        this.links = links;
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
        if (links != null) {
            joiner.add("links: " + GraphQLRequestSerializer.getEntry(links));
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

        private java.util.List<LinkTO> links;
        private Integer count;

        public Builder() {
        }

        public Builder setLinks(java.util.List<LinkTO> links) {
            this.links = links;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public LinkSearchResultTO build() {
            return new LinkSearchResultTO(links, count);
        }

    }
}
