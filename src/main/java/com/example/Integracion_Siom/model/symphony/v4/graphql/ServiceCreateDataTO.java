package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceCreateDataTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String externalId;
    @javax.validation.constraints.NotNull
    private ServiceStatusTO status = ServiceStatusTO.PENDING;
    @javax.validation.constraints.NotNull
    private String serviceTypeId;
    private String customerId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> upstreamServiceIds;
    private java.util.List<PropertyInputTO> properties;

    public ServiceCreateDataTO() {
    }

    public ServiceCreateDataTO(String name, String externalId, ServiceStatusTO status, String serviceTypeId, String customerId, java.util.List<String> upstreamServiceIds, java.util.List<PropertyInputTO> properties) {
        this.name = name;
        this.externalId = externalId;
        this.status = status;
        this.serviceTypeId = serviceTypeId;
        this.customerId = customerId;
        this.upstreamServiceIds = upstreamServiceIds;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public ServiceStatusTO getStatus() {
        return status;
    }

    public void setStatus(ServiceStatusTO status) {
        this.status = status;
    }

    public String getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(String serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public java.util.List<String> getUpstreamServiceIds() {
        return upstreamServiceIds;
    }

    public void setUpstreamServiceIds(java.util.List<String> upstreamServiceIds) {
        this.upstreamServiceIds = upstreamServiceIds;
    }

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (serviceTypeId != null) {
            joiner.add("serviceTypeId: " + GraphQLRequestSerializer.getEntry(serviceTypeId));
        }
        if (customerId != null) {
            joiner.add("customerId: " + GraphQLRequestSerializer.getEntry(customerId));
        }
        if (upstreamServiceIds != null) {
            joiner.add("upstreamServiceIds: " + GraphQLRequestSerializer.getEntry(upstreamServiceIds));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String externalId;
        private ServiceStatusTO status = ServiceStatusTO.PENDING;
        private String serviceTypeId;
        private String customerId;
        private java.util.List<String> upstreamServiceIds;
        private java.util.List<PropertyInputTO> properties;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setStatus(ServiceStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setServiceTypeId(String serviceTypeId) {
            this.serviceTypeId = serviceTypeId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setUpstreamServiceIds(java.util.List<String> upstreamServiceIds) {
            this.upstreamServiceIds = upstreamServiceIds;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }


        public ServiceCreateDataTO build() {
            return new ServiceCreateDataTO(name, externalId, status, serviceTypeId, customerId, upstreamServiceIds, properties);
        }

    }
}
