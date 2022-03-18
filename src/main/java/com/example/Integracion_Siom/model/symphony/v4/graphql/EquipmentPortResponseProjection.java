package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortResponseProjection() {
    }

    public EquipmentPortResponseProjection id() {
        return id(null);
    }

    public EquipmentPortResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPortResponseProjection definition(EquipmentPortDefinitionResponseProjection subProjection) {
        return definition(null, subProjection);
    }

    public EquipmentPortResponseProjection definition(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("definition").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection parentEquipment(EquipmentResponseProjection subProjection) {
        return parentEquipment(null, subProjection);
    }

    public EquipmentPortResponseProjection parentEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentEquipment").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection link(LinkResponseProjection subProjection) {
        return link(null, subProjection);
    }

    public EquipmentPortResponseProjection link(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("link").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public EquipmentPortResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection serviceEndpoints(ServiceEndpointResponseProjection subProjection) {
        return serviceEndpoints(null, subProjection);
    }

    public EquipmentPortResponseProjection serviceEndpoints(String alias, ServiceEndpointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceEndpoints").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public EquipmentPortResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }


}
