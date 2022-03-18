package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkTopologyResponseProjection extends GraphQLResponseProjection {

    public NetworkTopologyResponseProjection() {
    }

    public NetworkTopologyResponseProjection nodes() {
        return nodes(null);
    }

    public NetworkTopologyResponseProjection nodes(String alias) {
        fields.add(new GraphQLResponseField("nodes").alias(alias));
        return this;
    }

    public NetworkTopologyResponseProjection links(TopologyLinkResponseProjection subProjection) {
        return links(null, subProjection);
    }

    public NetworkTopologyResponseProjection links(String alias, TopologyLinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("links").alias(alias).projection(subProjection));
        return this;
    }


}
