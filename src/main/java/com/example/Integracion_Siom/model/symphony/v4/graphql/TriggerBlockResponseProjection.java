package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerBlockResponseProjection extends GraphQLResponseProjection {

    public TriggerBlockResponseProjection() {
    }

    public TriggerBlockResponseProjection triggerType(TriggerTypeResponseProjection subProjection) {
        return triggerType(null, subProjection);
    }

    public TriggerBlockResponseProjection triggerType(String alias, TriggerTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("triggerType").alias(alias).projection(subProjection));
        return this;
    }

    public TriggerBlockResponseProjection params(VariableExpressionResponseProjection subProjection) {
        return params(null, subProjection);
    }

    public TriggerBlockResponseProjection params(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("params").alias(alias).projection(subProjection));
        return this;
    }

    public TriggerBlockResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public TriggerBlockResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }


}
