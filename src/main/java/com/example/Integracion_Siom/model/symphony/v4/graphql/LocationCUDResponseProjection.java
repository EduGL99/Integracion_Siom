package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationCUDResponseProjection extends GraphQLResponseProjection {

    public LocationCUDResponseProjection() {
    }

    public LocationCUDResponseProjection create(LocationPermissionRuleResponseProjection subProjection) {
        return create(null, subProjection);
    }

    public LocationCUDResponseProjection create(String alias, LocationPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("create").alias(alias).projection(subProjection));
        return this;
    }

    public LocationCUDResponseProjection update(LocationPermissionRuleResponseProjection subProjection) {
        return update(null, subProjection);
    }

    public LocationCUDResponseProjection update(String alias, LocationPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("update").alias(alias).projection(subProjection));
        return this;
    }

    public LocationCUDResponseProjection delete(LocationPermissionRuleResponseProjection subProjection) {
        return delete(null, subProjection);
    }

    public LocationCUDResponseProjection delete(String alias, LocationPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("delete").alias(alias).projection(subProjection));
        return this;
    }


}
