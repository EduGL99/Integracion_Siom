package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderDefinitionResponseProjection extends GraphQLResponseProjection {

    public WorkOrderDefinitionResponseProjection() {
    }

    public WorkOrderDefinitionResponseProjection id() {
        return id(null);
    }

    public WorkOrderDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderDefinitionResponseProjection index() {
        return index(null);
    }

    public WorkOrderDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public WorkOrderDefinitionResponseProjection type(WorkOrderTypeResponseProjection subProjection) {
        return type(null, subProjection);
    }

    public WorkOrderDefinitionResponseProjection type(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("type").alias(alias).projection(subProjection));
        return this;
    }


}
