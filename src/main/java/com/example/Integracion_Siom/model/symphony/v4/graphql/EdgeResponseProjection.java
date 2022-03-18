package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Edge
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdgeResponseProjection extends GraphQLResponseProjection {

    public EdgeResponseProjection() {
    }

    public EdgeResponseProjection name() {
        return name(null);
    }

    public EdgeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EdgeResponseProjection type() {
        return type(null);
    }

    public EdgeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public EdgeResponseProjection ids() {
        return ids(null);
    }

    public EdgeResponseProjection ids(String alias) {
        fields.add(new GraphQLResponseField("ids").alias(alias));
        return this;
    }


}
