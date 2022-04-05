package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerTypeResponseProjection extends GraphQLResponseProjection {

    public TriggerTypeResponseProjection() {
    }

    public TriggerTypeResponseProjection id() {
        return id(null);
    }

    public TriggerTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TriggerTypeResponseProjection description() {
        return description(null);
    }

    public TriggerTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TriggerTypeResponseProjection variables(VariableDefinitionResponseProjection subProjection) {
        return variables(null, subProjection);
    }

    public TriggerTypeResponseProjection variables(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variables").alias(alias).projection(subProjection));
        return this;
    }


}
