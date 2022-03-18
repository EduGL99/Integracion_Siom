package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentTypeEdge
 */

public class EquipmentTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentTypeEdgeResponseProjection() {
    }

    public EquipmentTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public EquipmentTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EquipmentTypeEdgeResponseProjection.EquipmentTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentTypeEdgeResponseProjection.EquipmentTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("EquipmentTypeEdgeResponseProjection.EquipmentTypeResponseProjection.node", 0) + 1);
            this.node(new EquipmentTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentTypeEdgeResponseProjection.EquipmentTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public EquipmentTypeEdgeResponseProjection node(EquipmentTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentTypeEdgeResponseProjection node(String alias, EquipmentTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EquipmentTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public EquipmentTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
