package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageInfoResponseProjection extends GraphQLResponseProjection {

    public PageInfoResponseProjection() {
    }

    public PageInfoResponseProjection hasNextPage() {
        return hasNextPage(null);
    }

    public PageInfoResponseProjection hasNextPage(String alias) {
        fields.add(new GraphQLResponseField("hasNextPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection hasPreviousPage() {
        return hasPreviousPage(null);
    }

    public PageInfoResponseProjection hasPreviousPage(String alias) {
        fields.add(new GraphQLResponseField("hasPreviousPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection startCursor() {
        return startCursor(null);
    }

    public PageInfoResponseProjection startCursor(String alias) {
        fields.add(new GraphQLResponseField("startCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection endCursor() {
        return endCursor(null);
    }

    public PageInfoResponseProjection endCursor(String alias) {
        fields.add(new GraphQLResponseField("endCursor").alias(alias));
        return this;
    }


}
