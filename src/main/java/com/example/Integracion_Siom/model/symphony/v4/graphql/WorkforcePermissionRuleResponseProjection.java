package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforcePermissionRuleResponseProjection extends GraphQLResponseProjection {

    public WorkforcePermissionRuleResponseProjection() {
    }

    public WorkforcePermissionRuleResponseProjection isAllowed() {
        return isAllowed(null);
    }

    public WorkforcePermissionRuleResponseProjection isAllowed(String alias) {
        fields.add(new GraphQLResponseField("isAllowed").alias(alias));
        return this;
    }

    public WorkforcePermissionRuleResponseProjection projectTypeIds() {
        return projectTypeIds(null);
    }

    public WorkforcePermissionRuleResponseProjection projectTypeIds(String alias) {
        fields.add(new GraphQLResponseField("projectTypeIds").alias(alias));
        return this;
    }

    public WorkforcePermissionRuleResponseProjection workOrderTypeIds() {
        return workOrderTypeIds(null);
    }

    public WorkforcePermissionRuleResponseProjection workOrderTypeIds(String alias) {
        fields.add(new GraphQLResponseField("workOrderTypeIds").alias(alias));
        return this;
    }


}
