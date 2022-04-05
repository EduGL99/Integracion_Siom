package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> services;
    @javax.validation.constraints.NotNull
    private Integer count;

    public ServiceSearchResultTO() {
    }

    public ServiceSearchResultTO(java.util.List<ServiceTO> services, Integer count) {
        this.services = services;
        this.count = count;
    }

    public java.util.List<ServiceTO> getServices() {
        return services;
    }

    public void setServices(java.util.List<ServiceTO> services) {
        this.services = services;
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
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
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

        private java.util.List<ServiceTO> services;
        private Integer count;

        public Builder() {
        }

        public Builder setServices(java.util.List<ServiceTO> services) {
            this.services = services;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public ServiceSearchResultTO build() {
            return new ServiceSearchResultTO(services, count);
        }

    }
}
