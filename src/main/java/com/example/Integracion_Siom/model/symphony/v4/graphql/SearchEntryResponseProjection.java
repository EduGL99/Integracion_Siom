package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchEntryResponseProjection extends GraphQLResponseProjection {

    public SearchEntryResponseProjection() {
    }

    public SearchEntryResponseProjection entityId() {
        return entityId(null);
    }

    public SearchEntryResponseProjection entityId(String alias) {
        fields.add(new GraphQLResponseField("entityId").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection entityType() {
        return entityType(null);
    }

    public SearchEntryResponseProjection entityType(String alias) {
        fields.add(new GraphQLResponseField("entityType").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection name() {
        return name(null);
    }

    public SearchEntryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection type() {
        return type(null);
    }

    public SearchEntryResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection externalId() {
        return externalId(null);
    }

    public SearchEntryResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }


}
