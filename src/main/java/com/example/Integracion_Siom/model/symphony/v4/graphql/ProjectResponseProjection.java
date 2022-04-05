package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectResponseProjection extends GraphQLResponseProjection {

    public ProjectResponseProjection() {
    }

    public ProjectResponseProjection id() {
        return id(null);
    }

    public ProjectResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectResponseProjection name() {
        return name(null);
    }

    public ProjectResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectResponseProjection description() {
        return description(null);
    }

    public ProjectResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectResponseProjection priority() {
        return priority(null);
    }

    public ProjectResponseProjection priority(String alias) {
        fields.add(new GraphQLResponseField("priority").alias(alias));
        return this;
    }

    public ProjectResponseProjection createdBy(UserResponseProjection subProjection) {
        return createdBy(null, subProjection);
    }

    public ProjectResponseProjection createdBy(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createdBy").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection createTime() {
        return createTime(null);
    }

    public ProjectResponseProjection createTime(String alias) {
        fields.add(new GraphQLResponseField("createTime").alias(alias));
        return this;
    }

    public ProjectResponseProjection type(ProjectTypeResponseProjection subProjection) {
        return type(null, subProjection);
    }

    public ProjectResponseProjection type(String alias, ProjectTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("type").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection template(ProjectTemplateResponseProjection subProjection) {
        return template(null, subProjection);
    }

    public ProjectResponseProjection template(String alias, ProjectTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("template").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public ProjectResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection workOrders(WorkOrderResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public ProjectResponseProjection workOrders(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection numberOfWorkOrders() {
        return numberOfWorkOrders(null);
    }

    public ProjectResponseProjection numberOfWorkOrders(String alias) {
        fields.add(new GraphQLResponseField("numberOfWorkOrders").alias(alias));
        return this;
    }

    public ProjectResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ProjectResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection comments(CommentResponseProjection subProjection) {
        return comments(null, subProjection);
    }

    public ProjectResponseProjection comments(String alias, CommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }


}
