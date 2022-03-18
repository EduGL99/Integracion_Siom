package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Comment
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentResponseProjection extends GraphQLResponseProjection {

    public CommentResponseProjection() {
    }

    public CommentResponseProjection id() {
        return id(null);
    }

    public CommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CommentResponseProjection author(UserResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public CommentResponseProjection author(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection text() {
        return text(null);
    }

    public CommentResponseProjection text(String alias) {
        fields.add(new GraphQLResponseField("text").alias(alias));
        return this;
    }

    public CommentResponseProjection createTime() {
        return createTime(null);
    }

    public CommentResponseProjection createTime(String alias) {
        fields.add(new GraphQLResponseField("createTime").alias(alias));
        return this;
    }


}
