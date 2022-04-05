package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortTypeEdgeResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortTypeEdgeResponseProjection() {
    }

    public EquipmentPortTypeEdgeResponseProjection node(EquipmentPortTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentPortTypeEdgeResponseProjection node(String alias, EquipmentPortTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentPortTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
