package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopologyLinkResponseProjection extends GraphQLResponseProjection {

    public TopologyLinkResponseProjection() {
    }

    public TopologyLinkResponseProjection type() {
        return type(null);
    }

    public TopologyLinkResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public TopologyLinkResponseProjection source() {
        return source(null);
    }

    public TopologyLinkResponseProjection source(String alias) {
        fields.add(new GraphQLResponseField("source").alias(alias));
        return this;
    }

    public TopologyLinkResponseProjection target() {
        return target(null);
    }

    public TopologyLinkResponseProjection target(String alias) {
        fields.add(new GraphQLResponseField("target").alias(alias));
        return this;
    }


}
