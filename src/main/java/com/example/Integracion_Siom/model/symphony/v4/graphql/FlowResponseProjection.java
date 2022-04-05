package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowResponseProjection extends GraphQLResponseProjection {

    public FlowResponseProjection() {
    }

    public FlowResponseProjection id() {
        return id(null);
    }

    public FlowResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowResponseProjection name() {
        return name(null);
    }

    public FlowResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FlowResponseProjection description() {
        return description(null);
    }

    public FlowResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FlowResponseProjection endParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return endParamDefinitions(null, subProjection);
    }

    public FlowResponseProjection endParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public FlowResponseProjection status() {
        return status(null);
    }

    public FlowResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public FlowResponseProjection newInstancesPolicy() {
        return newInstancesPolicy(null);
    }

    public FlowResponseProjection newInstancesPolicy(String alias) {
        fields.add(new GraphQLResponseField("newInstancesPolicy").alias(alias));
        return this;
    }

    public FlowResponseProjection blocks(BlockResponseProjection subProjection) {
        return blocks(null, subProjection);
    }

    public FlowResponseProjection blocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blocks").alias(alias).projection(subProjection));
        return this;
    }

    public FlowResponseProjection connectors(ConnectorResponseProjection subProjection) {
        return connectors(null, subProjection);
    }

    public FlowResponseProjection connectors(String alias, ConnectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("connectors").alias(alias).projection(subProjection));
        return this;
    }

    public FlowResponseProjection draft(FlowDraftResponseProjection subProjection) {
        return draft(null, subProjection);
    }

    public FlowResponseProjection draft(String alias, FlowDraftResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("draft").alias(alias).projection(subProjection));
        return this;
    }


}
