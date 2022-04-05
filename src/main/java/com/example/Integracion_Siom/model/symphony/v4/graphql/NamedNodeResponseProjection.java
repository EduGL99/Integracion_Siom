package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

public class NamedNodeResponseProjection extends GraphQLResponseProjection {

    public NamedNodeResponseProjection() {
    }

    public NamedNodeResponseProjection id() {
        return id(null);
    }

    public NamedNodeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NamedNodeResponseProjection name() {
        return name(null);
    }

    public NamedNodeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }
}
