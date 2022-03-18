package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTypeResponseProjection extends GraphQLResponseProjection {

    public EquipmentTypeResponseProjection() {
    }

    public EquipmentTypeResponseProjection id() {
        return id(null);
    }

    public EquipmentTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentTypeResponseProjection name() {
        return name(null);
    }

    public EquipmentTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentTypeResponseProjection category() {
        return category(null);
    }

    public EquipmentTypeResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public EquipmentTypeResponseProjection positionDefinitions(EquipmentPositionDefinitionResponseProjection subProjection) {
        return positionDefinitions(null, subProjection);
    }

    public EquipmentTypeResponseProjection positionDefinitions(String alias, EquipmentPositionDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("positionDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection portDefinitions(EquipmentPortDefinitionResponseProjection subProjection) {
        return portDefinitions(null, subProjection);
    }

    public EquipmentTypeResponseProjection portDefinitions(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("portDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public EquipmentTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection equipments(EquipmentResponseProjection subProjection) {
        return equipments(null, subProjection);
    }

    public EquipmentTypeResponseProjection equipments(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipments").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection numberOfEquipment() {
        return numberOfEquipment(null);
    }

    public EquipmentTypeResponseProjection numberOfEquipment(String alias) {
        fields.add(new GraphQLResponseField("numberOfEquipment").alias(alias));
        return this;
    }


}
