package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortDefinitionEdgeResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortDefinitionEdgeResponseProjection() {
    }

    public EquipmentPortDefinitionEdgeResponseProjection node(EquipmentPortDefinitionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentPortDefinitionEdgeResponseProjection node(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentPortDefinitionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
