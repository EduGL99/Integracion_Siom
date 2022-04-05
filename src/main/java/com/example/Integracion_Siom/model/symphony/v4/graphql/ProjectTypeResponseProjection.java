package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTypeResponseProjection extends GraphQLResponseProjection {

    public ProjectTypeResponseProjection() {
    }

    public ProjectTypeResponseProjection id() {
        return id(null);
    }

    public ProjectTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection name() {
        return name(null);
    }

    public ProjectTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection description() {
        return description(null);
    }

    public ProjectTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection projects(ProjectResponseProjection subProjection) {
        return projects(null, subProjection);
    }

    public ProjectTypeResponseProjection projects(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeResponseProjection numberOfProjects() {
        return numberOfProjects(null);
    }

    public ProjectTypeResponseProjection numberOfProjects(String alias) {
        fields.add(new GraphQLResponseField("numberOfProjects").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection properties(PropertyTypeResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ProjectTypeResponseProjection properties(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeResponseProjection workOrders(WorkOrderDefinitionResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public ProjectTypeResponseProjection workOrders(String alias, WorkOrderDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }


}
