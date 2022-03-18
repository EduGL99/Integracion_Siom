package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Coordinates
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CoordinatesResponseProjection extends GraphQLResponseProjection {

    public CoordinatesResponseProjection() {
    }

    public CoordinatesResponseProjection latitude() {
        return latitude(null);
    }

    public CoordinatesResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public CoordinatesResponseProjection longitude() {
        return longitude(null);
    }

    public CoordinatesResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }


}
