package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectEdgeResponseProjection extends GraphQLResponseProjection {

    public ProjectEdgeResponseProjection() {
    }

    public ProjectEdgeResponseProjection node(ProjectResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProjectEdgeResponseProjection node(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProjectEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}