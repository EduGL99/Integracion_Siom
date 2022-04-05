package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CheckListCategoryDefinition
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckListCategoryDefinitionResponseProjection extends GraphQLResponseProjection {

    public CheckListCategoryDefinitionResponseProjection() {
    }

    public CheckListCategoryDefinitionResponseProjection id() {
        return id(null);
    }

    public CheckListCategoryDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection title() {
        return title(null);
    }

    public CheckListCategoryDefinitionResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection description() {
        return description(null);
    }

    public CheckListCategoryDefinitionResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection checklistItemDefinitions(CheckListItemDefinitionResponseProjection subProjection) {
        return checklistItemDefinitions(null, subProjection);
    }

    public CheckListCategoryDefinitionResponseProjection checklistItemDefinitions(String alias, CheckListItemDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checklistItemDefinitions").alias(alias).projection(subProjection));
        return this;
    }


}
