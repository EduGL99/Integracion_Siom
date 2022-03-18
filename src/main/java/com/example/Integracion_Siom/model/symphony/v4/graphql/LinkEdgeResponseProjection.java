package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkEdgeResponseProjection extends GraphQLResponseProjection {

    public LinkEdgeResponseProjection() {
    }

    public LinkEdgeResponseProjection node(LinkResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LinkEdgeResponseProjection node(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LinkEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LinkEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
