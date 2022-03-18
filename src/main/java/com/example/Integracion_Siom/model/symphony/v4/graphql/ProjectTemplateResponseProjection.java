package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTemplateResponseProjection extends GraphQLResponseProjection {

    public ProjectTemplateResponseProjection() {
    }

    public ProjectTemplateResponseProjection name() {
        return name(null);
    }

    public ProjectTemplateResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectTemplateResponseProjection description() {
        return description(null);
    }

    public ProjectTemplateResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectTemplateResponseProjection properties(PropertyTypeResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ProjectTemplateResponseProjection properties(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTemplateResponseProjection workOrders(WorkOrderDefinitionResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public ProjectTemplateResponseProjection workOrders(String alias, WorkOrderDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }


}
