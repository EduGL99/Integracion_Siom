package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTypeEdgeResponseProjection extends GraphQLResponseProjection {

    public ServiceTypeEdgeResponseProjection() {
    }

    public ServiceTypeEdgeResponseProjection node(ServiceTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ServiceTypeEdgeResponseProjection node(String alias, ServiceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ServiceTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
