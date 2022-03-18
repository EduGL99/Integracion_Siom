package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPositionResponseProjection extends GraphQLResponseProjection {

    public EquipmentPositionResponseProjection() {
    }

    public EquipmentPositionResponseProjection id() {
        return id(null);
    }

    public EquipmentPositionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPositionResponseProjection definition(EquipmentPositionDefinitionResponseProjection subProjection) {
        return definition(null, subProjection);
    }

    public EquipmentPositionResponseProjection definition(String alias, EquipmentPositionDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("definition").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPositionResponseProjection parentEquipment(EquipmentResponseProjection subProjection) {
        return parentEquipment(null, subProjection);
    }

    public EquipmentPositionResponseProjection parentEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentEquipment").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPositionResponseProjection attachedEquipment(EquipmentResponseProjection subProjection) {
        return attachedEquipment(null, subProjection);
    }

    public EquipmentPositionResponseProjection attachedEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("attachedEquipment").alias(alias).projection(subProjection));
        return this;
    }


}
