package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockUIRepresentationResponseProjection extends GraphQLResponseProjection {

    public BlockUIRepresentationResponseProjection() {
    }

    public BlockUIRepresentationResponseProjection name() {
        return name(null);
    }

    public BlockUIRepresentationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public BlockUIRepresentationResponseProjection xPosition() {
        return xPosition(null);
    }

    public BlockUIRepresentationResponseProjection xPosition(String alias) {
        fields.add(new GraphQLResponseField("xPosition").alias(alias));
        return this;
    }

    public BlockUIRepresentationResponseProjection yPosition() {
        return yPosition(null);
    }

    public BlockUIRepresentationResponseProjection yPosition(String alias) {
        fields.add(new GraphQLResponseField("yPosition").alias(alias));
        return this;
    }


}
