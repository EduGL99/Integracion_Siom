package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortDefinitionResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortDefinitionResponseProjection() {
    }

    public EquipmentPortDefinitionResponseProjection id() {
        return id(null);
    }

    public EquipmentPortDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection name() {
        return name(null);
    }

    public EquipmentPortDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection index() {
        return index(null);
    }

    public EquipmentPortDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection visibleLabel() {
        return visibleLabel(null);
    }

    public EquipmentPortDefinitionResponseProjection visibleLabel(String alias) {
        fields.add(new GraphQLResponseField("visibleLabel").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection portType(EquipmentPortTypeResponseProjection subProjection) {
        return portType(null, subProjection);
    }

    public EquipmentPortDefinitionResponseProjection portType(String alias, EquipmentPortTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("portType").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection bandwidth() {
        return bandwidth(null);
    }

    public EquipmentPortDefinitionResponseProjection bandwidth(String alias) {
        fields.add(new GraphQLResponseField("bandwidth").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection connectedPorts(EquipmentPortDefinitionResponseProjection subProjection) {
        return connectedPorts(null, subProjection);
    }

    public EquipmentPortDefinitionResponseProjection connectedPorts(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("connectedPorts").alias(alias).projection(subProjection));
        return this;
    }


}
