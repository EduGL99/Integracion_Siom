package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VertexResponseProjection extends GraphQLResponseProjection {

    public VertexResponseProjection() {
    }

    public VertexResponseProjection id() {
        return id(null);
    }

    public VertexResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public VertexResponseProjection type() {
        return type(null);
    }

    public VertexResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public VertexResponseProjection fields(FieldResponseProjection subProjection) {
        return fields(null, subProjection);
    }

    public VertexResponseProjection fields(String alias, FieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fields").alias(alias).projection(subProjection));
        return this;
    }

    public VertexResponseProjection edges(EdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public VertexResponseProjection edges(String alias, EdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }


}
