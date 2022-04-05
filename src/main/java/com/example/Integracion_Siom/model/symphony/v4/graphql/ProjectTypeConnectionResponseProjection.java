package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTypeConnectionResponseProjection extends GraphQLResponseProjection {

    public ProjectTypeConnectionResponseProjection() {
    }

    public ProjectTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ProjectTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ProjectTypeConnectionResponseProjection edges(ProjectTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProjectTypeConnectionResponseProjection edges(String alias, ProjectTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProjectTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
