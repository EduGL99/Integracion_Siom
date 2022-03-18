package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforcePolicyResponseProjection extends GraphQLResponseProjection {

    public WorkforcePolicyResponseProjection() {
    }

    public WorkforcePolicyResponseProjection read(WorkforcePermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public WorkforcePolicyResponseProjection read(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforcePolicyResponseProjection data(WorkforceCUDResponseProjection subProjection) {
        return data(null, subProjection);
    }

    public WorkforcePolicyResponseProjection data(String alias, WorkforceCUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("data").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforcePolicyResponseProjection templates(CUDResponseProjection subProjection) {
        return templates(null, subProjection);
    }

    public WorkforcePolicyResponseProjection templates(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("templates").alias(alias).projection(subProjection));
        return this;
    }


}
