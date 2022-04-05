package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionSettingsTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private AdministrativePolicyTO adminPolicy;
    @javax.validation.constraints.NotNull
    private InventoryPolicyTO inventoryPolicy;
    @javax.validation.constraints.NotNull
    private WorkforcePolicyTO workforcePolicy;
    @javax.validation.constraints.NotNull
    private AutomationPolicyTO automationPolicy;

    public PermissionSettingsTO() {
    }

    public PermissionSettingsTO(AdministrativePolicyTO adminPolicy, InventoryPolicyTO inventoryPolicy, WorkforcePolicyTO workforcePolicy, AutomationPolicyTO automationPolicy) {
        this.adminPolicy = adminPolicy;
        this.inventoryPolicy = inventoryPolicy;
        this.workforcePolicy = workforcePolicy;
        this.automationPolicy = automationPolicy;
    }

    public AdministrativePolicyTO getAdminPolicy() {
        return adminPolicy;
    }

    public void setAdminPolicy(AdministrativePolicyTO adminPolicy) {
        this.adminPolicy = adminPolicy;
    }

    public InventoryPolicyTO getInventoryPolicy() {
        return inventoryPolicy;
    }

    public void setInventoryPolicy(InventoryPolicyTO inventoryPolicy) {
        this.inventoryPolicy = inventoryPolicy;
    }

    public WorkforcePolicyTO getWorkforcePolicy() {
        return workforcePolicy;
    }

    public void setWorkforcePolicy(WorkforcePolicyTO workforcePolicy) {
        this.workforcePolicy = workforcePolicy;
    }

    public AutomationPolicyTO getAutomationPolicy() {
        return automationPolicy;
    }

    public void setAutomationPolicy(AutomationPolicyTO automationPolicy) {
        this.automationPolicy = automationPolicy;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (adminPolicy != null) {
            joiner.add("adminPolicy: " + GraphQLRequestSerializer.getEntry(adminPolicy));
        }
        if (inventoryPolicy != null) {
            joiner.add("inventoryPolicy: " + GraphQLRequestSerializer.getEntry(inventoryPolicy));
        }
        if (workforcePolicy != null) {
            joiner.add("workforcePolicy: " + GraphQLRequestSerializer.getEntry(workforcePolicy));
        }
        if (automationPolicy != null) {
            joiner.add("automationPolicy: " + GraphQLRequestSerializer.getEntry(automationPolicy));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private AdministrativePolicyTO adminPolicy;
        private InventoryPolicyTO inventoryPolicy;
        private WorkforcePolicyTO workforcePolicy;
        private AutomationPolicyTO automationPolicy;

        public Builder() {
        }

        public Builder setAdminPolicy(AdministrativePolicyTO adminPolicy) {
            this.adminPolicy = adminPolicy;
            return this;
        }

        public Builder setInventoryPolicy(InventoryPolicyTO inventoryPolicy) {
            this.inventoryPolicy = inventoryPolicy;
            return this;
        }

        public Builder setWorkforcePolicy(WorkforcePolicyTO workforcePolicy) {
            this.workforcePolicy = workforcePolicy;
            return this;
        }

        public Builder setAutomationPolicy(AutomationPolicyTO automationPolicy) {
            this.automationPolicy = automationPolicy;
            return this;
        }


        public PermissionSettingsTO build() {
            return new PermissionSettingsTO(adminPolicy, inventoryPolicy, workforcePolicy, automationPolicy);
        }

    }
}
