package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GotoBlockResponseProjection extends GraphQLResponseProjection {

    public GotoBlockResponseProjection() {
    }

    public GotoBlockResponseProjection target(BlockResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public GotoBlockResponseProjection target(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }

    public GotoBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public GotoBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }


}
