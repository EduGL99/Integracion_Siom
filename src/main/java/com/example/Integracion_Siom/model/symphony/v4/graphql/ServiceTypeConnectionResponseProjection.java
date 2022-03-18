package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTypeConnectionResponseProjection extends GraphQLResponseProjection {

    public ServiceTypeConnectionResponseProjection() {
    }

    public ServiceTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ServiceTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ServiceTypeConnectionResponseProjection edges(ServiceTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ServiceTypeConnectionResponseProjection edges(String alias, ServiceTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ServiceTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }


}
