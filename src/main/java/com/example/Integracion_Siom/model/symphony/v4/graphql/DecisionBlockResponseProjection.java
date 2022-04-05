package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionBlockResponseProjection extends GraphQLResponseProjection {

    public DecisionBlockResponseProjection() {
    }

    public DecisionBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public DecisionBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public DecisionBlockResponseProjection defaultExitPoint(ExitPointResponseProjection subProjection) {
        return defaultExitPoint(null, subProjection);
    }

    public DecisionBlockResponseProjection defaultExitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("defaultExitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public DecisionBlockResponseProjection routes(DecisionRouteResponseProjection subProjection) {
        return routes(null, subProjection);
    }

    public DecisionBlockResponseProjection routes(String alias, DecisionRouteResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("routes").alias(alias).projection(subProjection));
        return this;
    }


}
