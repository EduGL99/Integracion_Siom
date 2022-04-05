package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectorResponseProjection extends GraphQLResponseProjection {

    public ConnectorResponseProjection() {
    }

    public ConnectorResponseProjection source(ExitPointResponseProjection subProjection) {
        return source(null, subProjection);
    }

    public ConnectorResponseProjection source(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("source").alias(alias).projection(subProjection));
        return this;
    }

    public ConnectorResponseProjection target(EntryPointResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public ConnectorResponseProjection target(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }


}
