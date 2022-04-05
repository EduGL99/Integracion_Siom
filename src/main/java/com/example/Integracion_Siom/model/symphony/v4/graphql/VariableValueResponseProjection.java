package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableValueResponseProjection extends GraphQLResponseProjection {

    public VariableValueResponseProjection() {
    }

    public VariableValueResponseProjection variableDefinitionKey() {
        return variableDefinitionKey(null);
    }

    public VariableValueResponseProjection variableDefinitionKey(String alias) {
        fields.add(new GraphQLResponseField("variableDefinitionKey").alias(alias));
        return this;
    }

    public VariableValueResponseProjection value() {
        return value(null);
    }

    public VariableValueResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }


}
