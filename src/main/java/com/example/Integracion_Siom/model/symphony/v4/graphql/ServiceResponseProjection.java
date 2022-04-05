package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceResponseProjection extends GraphQLResponseProjection {

    public ServiceResponseProjection() {
    }

    public ServiceResponseProjection id() {
        return id(null);
    }

    public ServiceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceResponseProjection name() {
        return name(null);
    }

    public ServiceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceResponseProjection externalId() {
        return externalId(null);
    }

    public ServiceResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ServiceResponseProjection status() {
        return status(null);
    }

    public ServiceResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ServiceResponseProjection customer(CustomerResponseProjection subProjection) {
        return customer(null, subProjection);
    }

    public ServiceResponseProjection customer(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customer").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection serviceType(ServiceTypeResponseProjection subProjection) {
        return serviceType(null, subProjection);
    }

    public ServiceResponseProjection serviceType(String alias, ServiceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceType").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection upstream(ServiceResponseProjection subProjection) {
        return upstream(null, subProjection);
    }

    public ServiceResponseProjection upstream(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("upstream").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection downstream(ServiceResponseProjection subProjection) {
        return downstream(null, subProjection);
    }

    public ServiceResponseProjection downstream(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("downstream").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ServiceResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection endpoints(ServiceEndpointResponseProjection subProjection) {
        return endpoints(null, subProjection);
    }

    public ServiceResponseProjection endpoints(String alias, ServiceEndpointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endpoints").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection links(LinkResponseProjection subProjection) {
        return links(null, subProjection);
    }

    public ServiceResponseProjection links(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("links").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports(null, subProjection);
    }

    public ServiceResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection topology(NetworkTopologyResponseProjection subProjection) {
        return topology(null, subProjection);
    }

    public ServiceResponseProjection topology(String alias, NetworkTopologyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topology").alias(alias).projection(subProjection));
        return this;
    }


}
