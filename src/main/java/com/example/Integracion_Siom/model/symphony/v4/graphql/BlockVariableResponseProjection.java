package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockVariableResponseProjection extends GraphQLResponseProjection {

    public BlockVariableResponseProjection() {
    }

    public BlockVariableResponseProjection block(BlockResponseProjection subProjection) {
        return block(null, subProjection);
    }

    public BlockVariableResponseProjection block(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("block").alias(alias).projection(subProjection));
        return this;
    }

    public BlockVariableResponseProjection type() {
        return type(null);
    }

    public BlockVariableResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public BlockVariableResponseProjection inputVariableDefinition(VariableDefinitionResponseProjection subProjection) {
        return inputVariableDefinition(null, subProjection);
    }

    public BlockVariableResponseProjection inputVariableDefinition(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputVariableDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public BlockVariableResponseProjection inputPropertyTypeDefinition(PropertyTypeResponseProjection subProjection) {
        return inputPropertyTypeDefinition(null, subProjection);
    }

    public BlockVariableResponseProjection inputPropertyTypeDefinition(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputPropertyTypeDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public BlockVariableResponseProjection checkListItemDefinition(CheckListItemDefinitionResponseProjection subProjection) {
        return checkListItemDefinition(null, subProjection);
    }

    public BlockVariableResponseProjection checkListItemDefinition(String alias, CheckListItemDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListItemDefinition").alias(alias).projection(subProjection));
        return this;
    }


}
