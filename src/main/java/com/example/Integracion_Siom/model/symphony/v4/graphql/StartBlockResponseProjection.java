package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartBlockResponseProjection extends GraphQLResponseProjection {

    public StartBlockResponseProjection() {
    }

    public StartBlockResponseProjection paramDefinitions(VariableDefinitionResponseProjection subProjection) {
        return paramDefinitions(null, subProjection);
    }

    public StartBlockResponseProjection paramDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("paramDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public StartBlockResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public StartBlockResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }


}
