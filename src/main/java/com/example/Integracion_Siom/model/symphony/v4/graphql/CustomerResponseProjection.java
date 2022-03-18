package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Customer
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerResponseProjection extends GraphQLResponseProjection {

    public CustomerResponseProjection() {
    }

    public CustomerResponseProjection id() {
        return id(null);
    }

    public CustomerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CustomerResponseProjection name() {
        return name(null);
    }

    public CustomerResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CustomerResponseProjection externalId() {
        return externalId(null);
    }

    public CustomerResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }


}
