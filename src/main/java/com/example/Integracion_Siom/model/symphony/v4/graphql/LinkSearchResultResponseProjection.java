package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkSearchResultResponseProjection extends GraphQLResponseProjection {

    public LinkSearchResultResponseProjection() {
    }

    public LinkSearchResultResponseProjection links(LinkResponseProjection subProjection) {
        return links(null, subProjection);
    }

    public LinkSearchResultResponseProjection links(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("links").alias(alias).projection(subProjection));
        return this;
    }

    public LinkSearchResultResponseProjection count() {
        return count(null);
    }

    public LinkSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
