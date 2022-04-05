package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTypeEdgeResponseProjection extends GraphQLResponseProjection {

    public ProjectTypeEdgeResponseProjection() {
    }

    public ProjectTypeEdgeResponseProjection node(ProjectTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProjectTypeEdgeResponseProjection node(String alias, ProjectTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProjectTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
