package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEndpointDefinitionResponseProjection extends GraphQLResponseProjection {

    public ServiceEndpointDefinitionResponseProjection() {
    }

    public ServiceEndpointDefinitionResponseProjection id() {
        return id(null);
    }

    public ServiceEndpointDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection index() {
        return index(null);
    }

    public ServiceEndpointDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection role() {
        return role(null);
    }

    public ServiceEndpointDefinitionResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection name() {
        return name(null);
    }

    public ServiceEndpointDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection endpoints(ServiceEndpointResponseProjection subProjection) {
        return endpoints(null, subProjection);
    }

    public ServiceEndpointDefinitionResponseProjection endpoints(String alias, ServiceEndpointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endpoints").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection equipmentType(EquipmentTypeResponseProjection subProjection) {
        return equipmentType(null, subProjection);
    }

    public ServiceEndpointDefinitionResponseProjection equipmentType(String alias, EquipmentTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentType").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection serviceType(ServiceTypeResponseProjection subProjection) {
        return serviceType(null, subProjection);
    }

    public ServiceEndpointDefinitionResponseProjection serviceType(String alias, ServiceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceType").alias(alias).projection(subProjection));
        return this;
    }


}
