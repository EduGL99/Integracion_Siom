package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AdministrativePolicy
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdministrativePolicyResponseProjection extends GraphQLResponseProjection {

    public AdministrativePolicyResponseProjection() {
    }

    public AdministrativePolicyResponseProjection access(BasicPermissionRuleResponseProjection subProjection) {
        return access(null, subProjection);
    }

    public AdministrativePolicyResponseProjection access(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("access").alias(alias).projection(subProjection));
        return this;
    }


}
