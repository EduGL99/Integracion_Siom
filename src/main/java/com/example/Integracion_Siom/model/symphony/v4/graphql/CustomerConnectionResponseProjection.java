package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CustomerConnection
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerConnectionResponseProjection extends GraphQLResponseProjection {

    public CustomerConnectionResponseProjection() {
    }

    public CustomerConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CustomerConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CustomerConnectionResponseProjection edges(CustomerEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CustomerConnectionResponseProjection edges(String alias, CustomerEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CustomerConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
