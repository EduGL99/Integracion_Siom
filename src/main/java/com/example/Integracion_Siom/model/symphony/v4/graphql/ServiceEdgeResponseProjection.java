package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEdgeResponseProjection extends GraphQLResponseProjection {

    public ServiceEdgeResponseProjection() {
    }

    public ServiceEdgeResponseProjection node(ServiceResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ServiceEdgeResponseProjection node(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ServiceEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
