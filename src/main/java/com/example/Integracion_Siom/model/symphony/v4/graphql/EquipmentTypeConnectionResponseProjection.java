package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTypeConnectionResponseProjection extends GraphQLResponseProjection {

    public EquipmentTypeConnectionResponseProjection() {
    }

    public EquipmentTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentTypeConnectionResponseProjection edges(EquipmentTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentTypeConnectionResponseProjection edges(String alias, EquipmentTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
