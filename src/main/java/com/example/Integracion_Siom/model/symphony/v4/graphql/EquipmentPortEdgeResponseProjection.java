package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortEdgeResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortEdgeResponseProjection() {
    }

    public EquipmentPortEdgeResponseProjection node(EquipmentPortResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentPortEdgeResponseProjection node(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentPortEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
