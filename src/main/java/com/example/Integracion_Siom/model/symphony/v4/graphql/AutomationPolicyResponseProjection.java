package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutomationPolicyResponseProjection extends GraphQLResponseProjection {

    public AutomationPolicyResponseProjection() {
    }

    public AutomationPolicyResponseProjection read(BasicPermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public AutomationPolicyResponseProjection read(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public AutomationPolicyResponseProjection templates(CUDResponseProjection subProjection) {
        return templates(null, subProjection);
    }

    public AutomationPolicyResponseProjection templates(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("templates").alias(alias).projection(subProjection));
        return this;
    }


}
