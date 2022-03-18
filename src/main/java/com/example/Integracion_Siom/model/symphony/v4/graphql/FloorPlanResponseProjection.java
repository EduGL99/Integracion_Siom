package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanResponseProjection extends GraphQLResponseProjection {

    public FloorPlanResponseProjection() {
    }

    public FloorPlanResponseProjection id() {
        return id(null);
    }

    public FloorPlanResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FloorPlanResponseProjection name() {
        return name(null);
    }

    public FloorPlanResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FloorPlanResponseProjection locationID() {
        return locationID(null);
    }

    public FloorPlanResponseProjection locationID(String alias) {
        fields.add(new GraphQLResponseField("locationID").alias(alias));
        return this;
    }

    public FloorPlanResponseProjection image(FileResponseProjection subProjection) {
        return image(null, subProjection);
    }

    public FloorPlanResponseProjection image(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("image").alias(alias).projection(subProjection));
        return this;
    }

    public FloorPlanResponseProjection referencePoint(FloorPlanReferencePointResponseProjection subProjection) {
        return referencePoint(null, subProjection);
    }

    public FloorPlanResponseProjection referencePoint(String alias, FloorPlanReferencePointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("referencePoint").alias(alias).projection(subProjection));
        return this;
    }

    public FloorPlanResponseProjection scale(FloorPlanScaleResponseProjection subProjection) {
        return scale(null, subProjection);
    }

    public FloorPlanResponseProjection scale(String alias, FloorPlanScaleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("scale").alias(alias).projection(subProjection));
        return this;
    }


}
