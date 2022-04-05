package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSearchResultResponseProjection extends GraphQLResponseProjection {

    public UserSearchResultResponseProjection() {
    }

    public UserSearchResultResponseProjection users(UserResponseProjection subProjection) {
        return users(null, subProjection);
    }

    public UserSearchResultResponseProjection users(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("users").alias(alias).projection(subProjection));
        return this;
    }

    public UserSearchResultResponseProjection count() {
        return count(null);
    }

    public UserSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
