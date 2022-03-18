package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanReferencePointResponseProjection extends GraphQLResponseProjection {

    public FloorPlanReferencePointResponseProjection() {
    }

    public FloorPlanReferencePointResponseProjection x() {
        return x(null);
    }

    public FloorPlanReferencePointResponseProjection x(String alias) {
        fields.add(new GraphQLResponseField("x").alias(alias));
        return this;
    }

    public FloorPlanReferencePointResponseProjection y() {
        return y(null);
    }

    public FloorPlanReferencePointResponseProjection y(String alias) {
        fields.add(new GraphQLResponseField("y").alias(alias));
        return this;
    }

    public FloorPlanReferencePointResponseProjection latitude() {
        return latitude(null);
    }

    public FloorPlanReferencePointResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public FloorPlanReferencePointResponseProjection longitude() {
        return longitude(null);
    }

    public FloorPlanReferencePointResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }


}
