package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentSearchResultResponseProjection extends GraphQLResponseProjection {

    public EquipmentSearchResultResponseProjection() {
    }

    public EquipmentSearchResultResponseProjection equipment(EquipmentResponseProjection subProjection) {
        return equipment(null, subProjection);
    }

    public EquipmentSearchResultResponseProjection equipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipment").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentSearchResultResponseProjection count() {
        return count(null);
    }

    public EquipmentSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
