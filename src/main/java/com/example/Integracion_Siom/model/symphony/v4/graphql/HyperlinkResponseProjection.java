package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HyperlinkResponseProjection extends GraphQLResponseProjection {

    public HyperlinkResponseProjection() {
    }

    public HyperlinkResponseProjection id() {
        return id(null);
    }

    public HyperlinkResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public HyperlinkResponseProjection url() {
        return url(null);
    }

    public HyperlinkResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public HyperlinkResponseProjection displayName() {
        return displayName(null);
    }

    public HyperlinkResponseProjection displayName(String alias) {
        fields.add(new GraphQLResponseField("displayName").alias(alias));
        return this;
    }

    public HyperlinkResponseProjection category() {
        return category(null);
    }

    public HyperlinkResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public HyperlinkResponseProjection createTime() {
        return createTime(null);
    }

    public HyperlinkResponseProjection createTime(String alias) {
        fields.add(new GraphQLResponseField("createTime").alias(alias));
        return this;
    }


}
