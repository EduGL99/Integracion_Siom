package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryPolicyResponseProjection extends GraphQLResponseProjection {

    public InventoryPolicyResponseProjection() {
    }

    public InventoryPolicyResponseProjection read(BasicPermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public InventoryPolicyResponseProjection read(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection location(LocationCUDResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public InventoryPolicyResponseProjection location(String alias, LocationCUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection equipment(CUDResponseProjection subProjection) {
        return equipment(null, subProjection);
    }

    public InventoryPolicyResponseProjection equipment(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipment").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection equipmentType(CUDResponseProjection subProjection) {
        return equipmentType(null, subProjection);
    }

    public InventoryPolicyResponseProjection equipmentType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentType").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection locationType(CUDResponseProjection subProjection) {
        return locationType(null, subProjection);
    }

    public InventoryPolicyResponseProjection locationType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locationType").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection portType(CUDResponseProjection subProjection) {
        return portType(null, subProjection);
    }

    public InventoryPolicyResponseProjection portType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("portType").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection serviceType(CUDResponseProjection subProjection) {
        return serviceType(null, subProjection);
    }

    public InventoryPolicyResponseProjection serviceType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceType").alias(alias).projection(subProjection));
        return this;
    }


}
