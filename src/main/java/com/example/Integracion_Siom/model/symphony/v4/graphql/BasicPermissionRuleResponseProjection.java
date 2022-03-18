package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BasicPermissionRule
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicPermissionRuleResponseProjection extends GraphQLResponseProjection {

    public BasicPermissionRuleResponseProjection() {
    }

    public BasicPermissionRuleResponseProjection isAllowed() {
        return isAllowed(null);
    }

    public BasicPermissionRuleResponseProjection isAllowed(String alias) {
        fields.add(new GraphQLResponseField("isAllowed").alias(alias));
        return this;
    }


}
