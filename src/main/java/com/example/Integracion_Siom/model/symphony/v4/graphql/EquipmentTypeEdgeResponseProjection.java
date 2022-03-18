package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTypeEdgeResponseProjection extends GraphQLResponseProjection {

    public EquipmentTypeEdgeResponseProjection() {
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


}
