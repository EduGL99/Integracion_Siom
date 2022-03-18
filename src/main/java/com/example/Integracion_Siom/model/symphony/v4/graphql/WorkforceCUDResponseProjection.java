package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforceCUDResponseProjection extends GraphQLResponseProjection {

    public WorkforceCUDResponseProjection() {
    }

    public WorkforceCUDResponseProjection create(WorkforcePermissionRuleResponseProjection subProjection) {
        return create(null, subProjection);
    }

    public WorkforceCUDResponseProjection create(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("create").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection update(WorkforcePermissionRuleResponseProjection subProjection) {
        return update(null, subProjection);
    }

    public WorkforceCUDResponseProjection update(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("update").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection delete(WorkforcePermissionRuleResponseProjection subProjection) {
        return delete(null, subProjection);
    }

    public WorkforceCUDResponseProjection delete(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("delete").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection assign(WorkforcePermissionRuleResponseProjection subProjection) {
        return assign(null, subProjection);
    }

    public WorkforceCUDResponseProjection assign(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assign").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection transferOwnership(WorkforcePermissionRuleResponseProjection subProjection) {
        return transferOwnership(null, subProjection);
    }

    public WorkforceCUDResponseProjection transferOwnership(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("transferOwnership").alias(alias).projection(subProjection));
        return this;
    }


}
