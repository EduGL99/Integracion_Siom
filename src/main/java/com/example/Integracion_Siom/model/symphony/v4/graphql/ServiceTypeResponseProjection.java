package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTypeResponseProjection extends GraphQLResponseProjection {

    public ServiceTypeResponseProjection() {
    }

    public ServiceTypeResponseProjection id() {
        return id(null);
    }

    public ServiceTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection name() {
        return name(null);
    }

    public ServiceTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection isDeleted() {
        return isDeleted(null);
    }

    public ServiceTypeResponseProjection isDeleted(String alias) {
        fields.add(new GraphQLResponseField("isDeleted").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection hasCustomer() {
        return hasCustomer(null);
    }

    public ServiceTypeResponseProjection hasCustomer(String alias) {
        fields.add(new GraphQLResponseField("hasCustomer").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public ServiceTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public ServiceTypeResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeResponseProjection numberOfServices() {
        return numberOfServices(null);
    }

    public ServiceTypeResponseProjection numberOfServices(String alias) {
        fields.add(new GraphQLResponseField("numberOfServices").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection endpointDefinitions(ServiceEndpointDefinitionResponseProjection subProjection) {
        return endpointDefinitions(null, subProjection);
    }

    public ServiceTypeResponseProjection endpointDefinitions(String alias, ServiceEndpointDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endpointDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeResponseProjection discoveryMethod() {
        return discoveryMethod(null);
    }

    public ServiceTypeResponseProjection discoveryMethod(String alias) {
        fields.add(new GraphQLResponseField("discoveryMethod").alias(alias));
        return this;
    }


}
