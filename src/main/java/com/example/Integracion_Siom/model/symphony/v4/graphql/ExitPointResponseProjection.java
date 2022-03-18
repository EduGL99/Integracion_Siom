package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExitPointResponseProjection extends GraphQLResponseProjection {

    public ExitPointResponseProjection() {
    }

    public ExitPointResponseProjection id() {
        return id(null);
    }

    public ExitPointResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ExitPointResponseProjection parentBlock(BlockResponseProjection subProjection) {
        return parentBlock(null, subProjection);
    }

    public ExitPointResponseProjection parentBlock(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentBlock").alias(alias).projection(subProjection));
        return this;
    }

    public ExitPointResponseProjection cid() {
        return cid(null);
    }

    public ExitPointResponseProjection cid(String alias) {
        fields.add(new GraphQLResponseField("cid").alias(alias));
        return this;
    }

    public ExitPointResponseProjection nextEntryPoints(EntryPointResponseProjection subProjection) {
        return nextEntryPoints(null, subProjection);
    }

    public ExitPointResponseProjection nextEntryPoints(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nextEntryPoints").alias(alias).projection(subProjection));
        return this;
    }

    public ExitPointResponseProjection condition(VariableExpressionResponseProjection subProjection) {
        return condition(null, subProjection);
    }

    public ExitPointResponseProjection condition(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("condition").alias(alias).projection(subProjection));
        return this;
    }


}
