package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanScaleResponseProjection extends GraphQLResponseProjection {

    public FloorPlanScaleResponseProjection() {
    }

    public FloorPlanScaleResponseProjection referencePoint1X() {
        return referencePoint1X(null);
    }

    public FloorPlanScaleResponseProjection referencePoint1X(String alias) {
        fields.add(new GraphQLResponseField("referencePoint1X").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection referencePoint1Y() {
        return referencePoint1Y(null);
    }

    public FloorPlanScaleResponseProjection referencePoint1Y(String alias) {
        fields.add(new GraphQLResponseField("referencePoint1Y").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection referencePoint2X() {
        return referencePoint2X(null);
    }

    public FloorPlanScaleResponseProjection referencePoint2X(String alias) {
        fields.add(new GraphQLResponseField("referencePoint2X").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection referencePoint2Y() {
        return referencePoint2Y(null);
    }

    public FloorPlanScaleResponseProjection referencePoint2Y(String alias) {
        fields.add(new GraphQLResponseField("referencePoint2Y").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection scaleInMeters() {
        return scaleInMeters(null);
    }

    public FloorPlanScaleResponseProjection scaleInMeters(String alias) {
        fields.add(new GraphQLResponseField("scaleInMeters").alias(alias));
        return this;
    }


}
