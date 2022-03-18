package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddPermissionsPolicyInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private Boolean isGlobal;
    private InventoryPolicyInputTO inventoryInput;
    private WorkforcePolicyInputTO workforceInput;
    private AutomationPolicyInputTO automationInput;
    @javax.validation.constraints.NotNull
    private java.util.List<String> groups;

    public AddPermissionsPolicyInputTO() {
    }

    public AddPermissionsPolicyInputTO(String name, String description, Boolean isGlobal, InventoryPolicyInputTO inventoryInput, WorkforcePolicyInputTO workforceInput, AutomationPolicyInputTO automationInput, java.util.List<String> groups) {
        this.name = name;
        this.description = description;
        this.isGlobal = isGlobal;
        this.inventoryInput = inventoryInput;
        this.workforceInput = workforceInput;
        this.automationInput = automationInput;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public InventoryPolicyInputTO getInventoryInput() {
        return inventoryInput;
    }

    public void setInventoryInput(InventoryPolicyInputTO inventoryInput) {
        this.inventoryInput = inventoryInput;
    }

    public WorkforcePolicyInputTO getWorkforceInput() {
        return workforceInput;
    }

    public void setWorkforceInput(WorkforcePolicyInputTO workforceInput) {
        this.workforceInput = workforceInput;
    }

    public AutomationPolicyInputTO getAutomationInput() {
        return automationInput;
    }

    public void setAutomationInput(AutomationPolicyInputTO automationInput) {
        this.automationInput = automationInput;
    }

    public java.util.List<String> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (isGlobal != null) {
            joiner.add("isGlobal: " + GraphQLRequestSerializer.getEntry(isGlobal));
        }
        if (inventoryInput != null) {
            joiner.add("inventoryInput: " + GraphQLRequestSerializer.getEntry(inventoryInput));
        }
        if (workforceInput != null) {
            joiner.add("workforceInput: " + GraphQLRequestSerializer.getEntry(workforceInput));
        }
        if (automationInput != null) {
            joiner.add("automationInput: " + GraphQLRequestSerializer.getEntry(automationInput));
        }
        if (groups != null) {
            joiner.add("groups: " + GraphQLRequestSerializer.getEntry(groups));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private Boolean isGlobal;
        private InventoryPolicyInputTO inventoryInput;
        private WorkforcePolicyInputTO workforceInput;
        private AutomationPolicyInputTO automationInput;
        private java.util.List<String> groups;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setIsGlobal(Boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setInventoryInput(InventoryPolicyInputTO inventoryInput) {
            this.inventoryInput = inventoryInput;
            return this;
        }

        public Builder setWorkforceInput(WorkforcePolicyInputTO workforceInput) {
            this.workforceInput = workforceInput;
            return this;
        }

        public Builder setAutomationInput(AutomationPolicyInputTO automationInput) {
            this.automationInput = automationInput;
            return this;
        }

        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }


        public AddPermissionsPolicyInputTO build() {
            return new AddPermissionsPolicyInputTO(name, description, isGlobal, inventoryInput, workforceInput, automationInput, groups);
        }

    }
}
