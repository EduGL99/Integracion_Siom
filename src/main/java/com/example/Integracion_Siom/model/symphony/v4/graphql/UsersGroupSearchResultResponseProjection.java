package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersGroupSearchResultResponseProjection extends GraphQLResponseProjection {

    public UsersGroupSearchResultResponseProjection() {
    }

    public UsersGroupSearchResultResponseProjection usersGroups(UsersGroupResponseProjection subProjection) {
        return usersGroups(null, subProjection);
    }

    public UsersGroupSearchResultResponseProjection usersGroups(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("usersGroups").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupSearchResultResponseProjection count() {
        return count(null);
    }

    public UsersGroupSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
