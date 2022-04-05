package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CheckListCategory
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckListCategoryResponseProjection extends GraphQLResponseProjection {

    public CheckListCategoryResponseProjection() {
    }

    public CheckListCategoryResponseProjection id() {
        return id(null);
    }

    public CheckListCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckListCategoryResponseProjection title() {
        return title(null);
    }

    public CheckListCategoryResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CheckListCategoryResponseProjection description() {
        return description(null);
    }

    public CheckListCategoryResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public CheckListCategoryResponseProjection checkList(CheckListItemResponseProjection subProjection) {
        return checkList(null, subProjection);
    }

    public CheckListCategoryResponseProjection checkList(String alias, CheckListItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkList").alias(alias).projection(subProjection));
        return this;
    }


}
