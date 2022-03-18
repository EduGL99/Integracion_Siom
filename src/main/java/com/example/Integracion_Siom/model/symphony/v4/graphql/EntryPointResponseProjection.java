package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryPointResponseProjection extends GraphQLResponseProjection {

    public EntryPointResponseProjection() {
    }

    public EntryPointResponseProjection id() {
        return id(null);
    }

    public EntryPointResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EntryPointResponseProjection parentBlock(BlockResponseProjection subProjection) {
        return parentBlock(null, subProjection);
    }

    public EntryPointResponseProjection parentBlock(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentBlock").alias(alias).projection(subProjection));
        return this;
    }

    public EntryPointResponseProjection cid() {
        return cid(null);
    }

    public EntryPointResponseProjection cid(String alias) {
        fields.add(new GraphQLResponseField("cid").alias(alias));
        return this;
    }

    public EntryPointResponseProjection prevExitPoints(ExitPointResponseProjection subProjection) {
        return prevExitPoints(null, subProjection);
    }

    public EntryPointResponseProjection prevExitPoints(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("prevExitPoints").alias(alias).projection(subProjection));
        return this;
    }


}
