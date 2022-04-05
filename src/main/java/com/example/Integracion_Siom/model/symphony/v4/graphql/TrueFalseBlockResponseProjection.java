package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrueFalseBlockResponseProjection extends GraphQLResponseProjection {

    public TrueFalseBlockResponseProjection() {
    }

    public TrueFalseBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public TrueFalseBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public TrueFalseBlockResponseProjection trueExitPoint(ExitPointResponseProjection subProjection) {
        return trueExitPoint(null, subProjection);
    }

    public TrueFalseBlockResponseProjection trueExitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("trueExitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public TrueFalseBlockResponseProjection falseExitPoint(ExitPointResponseProjection subProjection) {
        return falseExitPoint(null, subProjection);
    }

    public TrueFalseBlockResponseProjection falseExitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("falseExitPoint").alias(alias).projection(subProjection));
        return this;
    }


}
