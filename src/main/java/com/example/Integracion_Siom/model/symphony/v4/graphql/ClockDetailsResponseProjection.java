package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClockDetailsResponseProjection extends GraphQLResponseProjection {

    public ClockDetailsResponseProjection() {
    }

    public ClockDetailsResponseProjection clockOutReason() {
        return clockOutReason(null);
    }

    public ClockDetailsResponseProjection clockOutReason(String alias) {
        fields.add(new GraphQLResponseField("clockOutReason").alias(alias));
        return this;
    }

    public ClockDetailsResponseProjection distanceMeters() {
        return distanceMeters(null);
    }

    public ClockDetailsResponseProjection distanceMeters(String alias) {
        fields.add(new GraphQLResponseField("distanceMeters").alias(alias));
        return this;
    }

    public ClockDetailsResponseProjection comment() {
        return comment(null);
    }

    public ClockDetailsResponseProjection comment(String alias) {
        fields.add(new GraphQLResponseField("comment").alias(alias));
        return this;
    }


}
