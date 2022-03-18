package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockInstanceResponseProjection extends GraphQLResponseProjection {

    public BlockInstanceResponseProjection() {
    }

    public BlockInstanceResponseProjection id() {
        return id(null);
    }

    public BlockInstanceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection status() {
        return status(null);
    }

    public BlockInstanceResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection inputs(VariableValueResponseProjection subProjection) {
        return inputs(null, subProjection);
    }

    public BlockInstanceResponseProjection inputs(String alias, VariableValueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputs").alias(alias).projection(subProjection));
        return this;
    }

    public BlockInstanceResponseProjection outputs(VariableValueResponseProjection subProjection) {
        return outputs(null, subProjection);
    }

    public BlockInstanceResponseProjection outputs(String alias, VariableValueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("outputs").alias(alias).projection(subProjection));
        return this;
    }

    public BlockInstanceResponseProjection failure_reason() {
        return failure_reason(null);
    }

    public BlockInstanceResponseProjection failure_reason(String alias) {
        fields.add(new GraphQLResponseField("failure_reason").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection block(BlockResponseProjection subProjection) {
        return block(null, subProjection);
    }

    public BlockInstanceResponseProjection block(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("block").alias(alias).projection(subProjection));
        return this;
    }

    public BlockInstanceResponseProjection startDate() {
        return startDate(null);
    }

    public BlockInstanceResponseProjection startDate(String alias) {
        fields.add(new GraphQLResponseField("startDate").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection endDate() {
        return endDate(null);
    }

    public BlockInstanceResponseProjection endDate(String alias) {
        fields.add(new GraphQLResponseField("endDate").alias(alias));
        return this;
    }


}
