package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkerTypeEdgeResponseProjection extends GraphQLResponseProjection {

    public WorkerTypeEdgeResponseProjection() {
    }

    public WorkerTypeEdgeResponseProjection node(WorkerTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public WorkerTypeEdgeResponseProjection node(String alias, WorkerTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public WorkerTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public WorkerTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }


}
