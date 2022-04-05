package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationPermissionRuleResponseProjection extends GraphQLResponseProjection {

    public LocationPermissionRuleResponseProjection() {
    }

    public LocationPermissionRuleResponseProjection isAllowed() {
        return isAllowed(null);
    }

    public LocationPermissionRuleResponseProjection isAllowed(String alias) {
        fields.add(new GraphQLResponseField("isAllowed").alias(alias));
        return this;
    }

    public LocationPermissionRuleResponseProjection locationTypeIds() {
        return locationTypeIds(null);
    }

    public LocationPermissionRuleResponseProjection locationTypeIds(String alias) {
        fields.add(new GraphQLResponseField("locationTypeIds").alias(alias));
        return this;
    }


}
