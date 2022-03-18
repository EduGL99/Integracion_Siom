package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewerResponseProjection extends GraphQLResponseProjection {

    public ViewerResponseProjection() {
    }

    public ViewerResponseProjection tenant() {
        return tenant(null);
    }

    public ViewerResponseProjection tenant(String alias) {
        fields.add(new GraphQLResponseField("tenant").alias(alias));
        return this;
    }

    public ViewerResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ViewerResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ViewerResponseProjection permissions(PermissionSettingsResponseProjection subProjection) {
        return permissions(null, subProjection);
    }

    public ViewerResponseProjection permissions(String alias, PermissionSettingsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection));
        return this;
    }


}
