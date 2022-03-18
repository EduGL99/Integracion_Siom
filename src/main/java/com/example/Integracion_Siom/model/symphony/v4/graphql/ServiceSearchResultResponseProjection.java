package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceSearchResultResponseProjection extends GraphQLResponseProjection {

    public ServiceSearchResultResponseProjection() {
    }

    public ServiceSearchResultResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public ServiceSearchResultResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSearchResultResponseProjection count() {
        return count(null);
    }

    public ServiceSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }


}
