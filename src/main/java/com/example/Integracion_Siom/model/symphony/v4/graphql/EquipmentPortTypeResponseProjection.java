package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortTypeResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortTypeResponseProjection() {
    }

    public EquipmentPortTypeResponseProjection id() {
        return id(null);
    }

    public EquipmentPortTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPortTypeResponseProjection name() {
        return name(null);
    }

    public EquipmentPortTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentPortTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public EquipmentPortTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeResponseProjection linkPropertyTypes(PropertyTypeResponseProjection subProjection) {
        return linkPropertyTypes(null, subProjection);
    }

    public EquipmentPortTypeResponseProjection linkPropertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linkPropertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeResponseProjection numberOfPortDefinitions() {
        return numberOfPortDefinitions(null);
    }

    public EquipmentPortTypeResponseProjection numberOfPortDefinitions(String alias) {
        fields.add(new GraphQLResponseField("numberOfPortDefinitions").alias(alias));
        return this;
    }


}
