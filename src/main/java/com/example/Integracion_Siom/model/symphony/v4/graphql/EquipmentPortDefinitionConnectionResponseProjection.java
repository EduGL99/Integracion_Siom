package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortDefinitionConnectionResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortDefinitionConnectionResponseProjection() {
    }

    public EquipmentPortDefinitionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentPortDefinitionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionConnectionResponseProjection edges(EquipmentPortDefinitionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentPortDefinitionConnectionResponseProjection edges(String alias, EquipmentPortDefinitionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentPortDefinitionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
