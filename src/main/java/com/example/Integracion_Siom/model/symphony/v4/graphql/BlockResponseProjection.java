package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockResponseProjection extends GraphQLResponseProjection {

    public BlockResponseProjection() {
    }

    public BlockResponseProjection id() {
        return id(null);
    }

    public BlockResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BlockResponseProjection cid() {
        return cid(null);
    }

    public BlockResponseProjection cid(String alias) {
        fields.add(new GraphQLResponseField("cid").alias(alias));
        return this;
    }

    public BlockResponseProjection nextBlocks(BlockResponseProjection subProjection) {
        return nextBlocks(null, subProjection);
    }

    public BlockResponseProjection nextBlocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nextBlocks").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection prevBlocks(BlockResponseProjection subProjection) {
        return prevBlocks(null, subProjection);
    }

    public BlockResponseProjection prevBlocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("prevBlocks").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection details() {
        return details(null);
    }

    public BlockResponseProjection details(String alias) {
        fields.add(new GraphQLResponseField("details").alias(alias));
        return this;
    }

    public BlockResponseProjection inputParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return inputParamDefinitions(null, subProjection);
    }

    public BlockResponseProjection inputParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection outputParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return outputParamDefinitions(null, subProjection);
    }

    public BlockResponseProjection outputParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("outputParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection uiRepresentation(BlockUIRepresentationResponseProjection subProjection) {
        return uiRepresentation(null, subProjection);
    }

    public BlockResponseProjection uiRepresentation(String alias, BlockUIRepresentationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("uiRepresentation").alias(alias).projection(subProjection));
        return this;
    }


}
