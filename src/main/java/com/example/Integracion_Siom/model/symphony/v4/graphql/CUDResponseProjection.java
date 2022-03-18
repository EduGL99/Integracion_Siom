package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CUD
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CUDResponseProjection extends GraphQLResponseProjection {

    public CUDResponseProjection() {
    }

    public CUDResponseProjection create(BasicPermissionRuleResponseProjection subProjection) {
        return create(null, subProjection);
    }

    public CUDResponseProjection create(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("create").alias(alias).projection(subProjection));
        return this;
    }

    public CUDResponseProjection update(BasicPermissionRuleResponseProjection subProjection) {
        return update(null, subProjection);
    }

    public CUDResponseProjection update(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("update").alias(alias).projection(subProjection));
        return this;
    }

    public CUDResponseProjection delete(BasicPermissionRuleResponseProjection subProjection) {
        return delete(null, subProjection);
    }

    public CUDResponseProjection delete(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("delete").alias(alias).projection(subProjection));
        return this;
    }


}
