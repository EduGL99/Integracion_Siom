package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AppointmentEdge
 */

public class AppointmentEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AppointmentEdgeResponseProjection() {
    }

    public AppointmentEdgeResponseProjection all$() {
        return all$(3);
    }

    public AppointmentEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AppointmentEdgeResponseProjection.AppointmentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("AppointmentEdgeResponseProjection.AppointmentResponseProjection.node", projectionDepthOnFields.getOrDefault("AppointmentEdgeResponseProjection.AppointmentResponseProjection.node", 0) + 1);
            this.node(new AppointmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AppointmentEdgeResponseProjection.AppointmentResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public AppointmentEdgeResponseProjection node(AppointmentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public AppointmentEdgeResponseProjection node(String alias, AppointmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public AppointmentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public AppointmentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public AppointmentEdgeResponseProjection typename() {
        return typename(null);
    }

    public AppointmentEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
