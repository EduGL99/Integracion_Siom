package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentEdgeResponseProjection extends GraphQLResponseProjection {

    public EquipmentEdgeResponseProjection() {
    }

    public EquipmentEdgeResponseProjection node(EquipmentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentEdgeResponseProjection node(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
