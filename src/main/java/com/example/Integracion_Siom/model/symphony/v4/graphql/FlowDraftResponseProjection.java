package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowDraftResponseProjection extends GraphQLResponseProjection {

    public FlowDraftResponseProjection() {
    }

    public FlowDraftResponseProjection id() {
        return id(null);
    }

    public FlowDraftResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowDraftResponseProjection name() {
        return name(null);
    }

    public FlowDraftResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FlowDraftResponseProjection description() {
        return description(null);
    }

    public FlowDraftResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FlowDraftResponseProjection endParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return endParamDefinitions(null, subProjection);
    }

    public FlowDraftResponseProjection endParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftResponseProjection blocks(BlockResponseProjection subProjection) {
        return blocks(null, subProjection);
    }

    public FlowDraftResponseProjection blocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blocks").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftResponseProjection connectors(ConnectorResponseProjection subProjection) {
        return connectors(null, subProjection);
    }

    public FlowDraftResponseProjection connectors(String alias, ConnectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("connectors").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftResponseProjection sameAsFlow() {
        return sameAsFlow(null);
    }

    public FlowDraftResponseProjection sameAsFlow(String alias) {
        fields.add(new GraphQLResponseField("sameAsFlow").alias(alias));
        return this;
    }


}
