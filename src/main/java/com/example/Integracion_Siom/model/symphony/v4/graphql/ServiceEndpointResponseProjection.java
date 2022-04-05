package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEndpointResponseProjection extends GraphQLResponseProjection {

    public ServiceEndpointResponseProjection() {
    }

    public ServiceEndpointResponseProjection id() {
        return id(null);
    }

    public ServiceEndpointResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceEndpointResponseProjection port(EquipmentPortResponseProjection subProjection) {
        return port(null, subProjection);
    }

    public ServiceEndpointResponseProjection port(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("port").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointResponseProjection equipment(EquipmentResponseProjection subProjection) {
        return equipment(null, subProjection);
    }

    public ServiceEndpointResponseProjection equipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipment").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointResponseProjection service(ServiceResponseProjection subProjection) {
        return service(null, subProjection);
    }

    public ServiceEndpointResponseProjection service(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("service").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointResponseProjection definition(ServiceEndpointDefinitionResponseProjection subProjection) {
        return definition(null, subProjection);
    }

    public ServiceEndpointResponseProjection definition(String alias, ServiceEndpointDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("definition").alias(alias).projection(subProjection));
        return this;
    }


}
