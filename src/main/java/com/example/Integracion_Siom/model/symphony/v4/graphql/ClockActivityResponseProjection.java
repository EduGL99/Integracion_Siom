package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClockActivityResponseProjection extends GraphQLResponseProjection {

    public ClockActivityResponseProjection() {
    }

    public ClockActivityResponseProjection author(UserResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public ClockActivityResponseProjection author(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public ClockActivityResponseProjection details(ClockDetailsResponseProjection subProjection) {
        return details(null, subProjection);
    }

    public ClockActivityResponseProjection details(String alias, ClockDetailsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("details").alias(alias).projection(subProjection));
        return this;
    }

    public ClockActivityResponseProjection time() {
        return time(null);
    }

    public ClockActivityResponseProjection time(String alias) {
        fields.add(new GraphQLResponseField("time").alias(alias));
        return this;
    }


}
