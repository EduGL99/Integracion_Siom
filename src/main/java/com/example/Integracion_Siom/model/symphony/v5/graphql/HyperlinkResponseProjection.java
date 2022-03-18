package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Hyperlink
 */

public class HyperlinkResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public HyperlinkResponseProjection() {
    }

    public HyperlinkResponseProjection all$() {
        return all$(3);
    }

    public HyperlinkResponseProjection all$(int maxDepth) {
        this.id();
        this.url();
        this.displayName();
        this.category();
        this.createTime();
        this.typename();
        return this;
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

    public HyperlinkResponseProjection typename() {
        return typename(null);
    }

    public HyperlinkResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
