package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypeEdgeResponseProjection extends GraphQLResponseProjection {

    public LocationTypeEdgeResponseProjection() {
    }

    public LocationTypeEdgeResponseProjection node(LocationTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LocationTypeEdgeResponseProjection node(String alias, LocationTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LocationTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
