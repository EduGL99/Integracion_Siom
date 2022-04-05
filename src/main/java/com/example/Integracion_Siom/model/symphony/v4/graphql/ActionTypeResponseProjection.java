package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionTypeResponseProjection extends GraphQLResponseProjection {

    public ActionTypeResponseProjection() {
    }

    public ActionTypeResponseProjection id() {
        return id(null);
    }

    public ActionTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActionTypeResponseProjection description() {
        return description(null);
    }

    public ActionTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ActionTypeResponseProjection variables(VariableDefinitionResponseProjection subProjection) {
        return variables(null, subProjection);
    }

    public ActionTypeResponseProjection variables(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variables").alias(alias).projection(subProjection));
        return this;
    }


}
