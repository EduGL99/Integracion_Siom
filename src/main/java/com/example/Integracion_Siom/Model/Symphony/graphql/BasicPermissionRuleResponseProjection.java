package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for BasicPermissionRule
 */

public class BasicPermissionRuleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public BasicPermissionRuleResponseProjection() {
    }

    public BasicPermissionRuleResponseProjection all$() {
        return all$(3);
    }

    public BasicPermissionRuleResponseProjection all$(int maxDepth) {
        this.isAllowed();
        this.typename();
        return this;
    }

    public BasicPermissionRuleResponseProjection isAllowed() {
        return isAllowed(null);
    }

    public BasicPermissionRuleResponseProjection isAllowed(String alias) {
        fields.add(new GraphQLResponseField("isAllowed").alias(alias));
        return this;
    }

    public BasicPermissionRuleResponseProjection typename() {
        return typename(null);
    }

    public BasicPermissionRuleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
