package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPositionDefinitionResponseProjection extends GraphQLResponseProjection {

    public EquipmentPositionDefinitionResponseProjection() {
    }

    public EquipmentPositionDefinitionResponseProjection id() {
        return id(null);
    }

    public EquipmentPositionDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection name() {
        return name(null);
    }

    public EquipmentPositionDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection index() {
        return index(null);
    }

    public EquipmentPositionDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection visibleLabel() {
        return visibleLabel(null);
    }

    public EquipmentPositionDefinitionResponseProjection visibleLabel(String alias) {
        fields.add(new GraphQLResponseField("visibleLabel").alias(alias));
        return this;
    }


}
