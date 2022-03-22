package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VendorTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<RecommendationsTO> vendorRecommendations;

    public VendorTO() {
    }

    public VendorTO(String id, String name, java.util.List<RecommendationsTO> vendorRecommendations) {
        this.id = id;
        this.name = name;
        this.vendorRecommendations = vendorRecommendations;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<RecommendationsTO> getVendorRecommendations() {
        return vendorRecommendations;
    }

    public void setVendorRecommendations(java.util.List<RecommendationsTO> vendorRecommendations) {
        this.vendorRecommendations = vendorRecommendations;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (vendorRecommendations != null) {
            joiner.add("vendorRecommendations: " + GraphQLRequestSerializer.getEntry(vendorRecommendations));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<RecommendationsTO> vendorRecommendations;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVendorRecommendations(java.util.List<RecommendationsTO> vendorRecommendations) {
            this.vendorRecommendations = vendorRecommendations;
            return this;
        }


        public VendorTO build() {
            return new VendorTO(id, name, vendorRecommendations);
        }

    }
}
