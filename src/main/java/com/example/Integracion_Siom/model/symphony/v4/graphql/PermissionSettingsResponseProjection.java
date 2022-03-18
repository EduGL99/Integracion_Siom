package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionSettingsResponseProjection extends GraphQLResponseProjection {

    public PermissionSettingsResponseProjection() {
    }

    public PermissionSettingsResponseProjection adminPolicy(AdministrativePolicyResponseProjection subProjection) {
        return adminPolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection adminPolicy(String alias, AdministrativePolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("adminPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection inventoryPolicy(InventoryPolicyResponseProjection subProjection) {
        return inventoryPolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection inventoryPolicy(String alias, InventoryPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection workforcePolicy(WorkforcePolicyResponseProjection subProjection) {
        return workforcePolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection workforcePolicy(String alias, WorkforcePolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workforcePolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection automationPolicy(AutomationPolicyResponseProjection subProjection) {
        return automationPolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection automationPolicy(String alias, AutomationPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("automationPolicy").alias(alias).projection(subProjection));
        return this;
    }


}
