package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SystemPolicy
 */

public class SystemPolicyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SystemPolicyResponseProjection() {
    }

    public SystemPolicyResponseProjection all$() {
        return all$(3);
    }

    public SystemPolicyResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public SystemPolicyResponseProjection onInventoryPolicy(InventoryPolicyResponseProjection subProjection) {
        return onInventoryPolicy(null, subProjection);
    }

    public SystemPolicyResponseProjection onInventoryPolicy(String alias, InventoryPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on InventoryPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public SystemPolicyResponseProjection onWorkforcePolicy(WorkforcePolicyResponseProjection subProjection) {
        return onWorkforcePolicy(null, subProjection);
    }

    public SystemPolicyResponseProjection onWorkforcePolicy(String alias, WorkforcePolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on WorkforcePolicy").alias(alias).projection(subProjection));
        return this;
    }

    public SystemPolicyResponseProjection onAutomationPolicy(AutomationPolicyResponseProjection subProjection) {
        return onAutomationPolicy(null, subProjection);
    }

    public SystemPolicyResponseProjection onAutomationPolicy(String alias, AutomationPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on AutomationPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public SystemPolicyResponseProjection typename() {
        return typename(null);
    }

    public SystemPolicyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
