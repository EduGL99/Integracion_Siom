package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortTypeConnectionResponseProjection extends GraphQLResponseProjection {

    public EquipmentPortTypeConnectionResponseProjection() {
    }

    public EquipmentPortTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentPortTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentPortTypeConnectionResponseProjection edges(EquipmentPortTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentPortTypeConnectionResponseProjection edges(String alias, EquipmentPortTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentPortTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
