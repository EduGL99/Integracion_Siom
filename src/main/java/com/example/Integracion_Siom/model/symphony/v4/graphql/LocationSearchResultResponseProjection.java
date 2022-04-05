package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationSearchResultResponseProjection extends GraphQLResponseProjection {

    public LocationSearchResultResponseProjection() {
    }

    public LocationSearchResultResponseProjection locations(LocationResponseProjection subProjection) {
        return locations(null, subProjection);
    }

    public LocationSearchResultResponseProjection locations(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locations").alias(alias).projection(subProjection));
        return this;
    }

    public LocationSearchResultResponseProjection count() {
        return count(null);
    }

    public LocationSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
