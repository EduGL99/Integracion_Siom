package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortConnectionResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortConnectionResponseProjection() {
    }

    public EquipmentPortConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentPortConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentPortConnectionResponseProjection edges(EquipmentPortEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentPortConnectionResponseProjection edges(String alias, EquipmentPortEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentPortConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
