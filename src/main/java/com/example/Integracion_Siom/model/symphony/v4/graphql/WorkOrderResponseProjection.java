package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderResponseProjection extends GraphQLResponseProjection {

    public WorkOrderResponseProjection() {
    }

    public WorkOrderResponseProjection id() {
        return id(null);
    }

    public WorkOrderResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection workOrderType(WorkOrderTypeResponseProjection subProjection) {
        return workOrderType(null, subProjection);
    }

    public WorkOrderResponseProjection workOrderType(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrderType").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection workOrderTemplate(WorkOrderTemplateResponseProjection subProjection) {
        return workOrderTemplate(null, subProjection);
    }

    public WorkOrderResponseProjection workOrderTemplate(String alias, WorkOrderTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrderTemplate").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection name() {
        return name(null);
    }

    public WorkOrderResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection description() {
        return description(null);
    }

    public WorkOrderResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection owner(UserResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public WorkOrderResponseProjection owner(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection creationDate() {
        return creationDate(null);
    }

    public WorkOrderResponseProjection creationDate(String alias) {
        fields.add(new GraphQLResponseField("creationDate").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection installDate() {
        return installDate(null);
    }

    public WorkOrderResponseProjection installDate(String alias) {
        fields.add(new GraphQLResponseField("installDate").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection assignedTo(UserResponseProjection subProjection) {
        return assignedTo(null, subProjection);
    }

    public WorkOrderResponseProjection assignedTo(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignedTo").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection index() {
        return index(null);
    }

    public WorkOrderResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection status() {
        return status(null);
    }

    public WorkOrderResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection priority() {
        return priority(null);
    }

    public WorkOrderResponseProjection priority(String alias) {
        fields.add(new GraphQLResponseField("priority").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection equipmentToAdd(EquipmentResponseProjection subProjection) {
        return equipmentToAdd(null, subProjection);
    }

    public WorkOrderResponseProjection equipmentToAdd(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentToAdd").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection equipmentToRemove(EquipmentResponseProjection subProjection) {
        return equipmentToRemove(null, subProjection);
    }

    public WorkOrderResponseProjection equipmentToRemove(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentToRemove").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection linksToAdd(LinkResponseProjection subProjection) {
        return linksToAdd(null, subProjection);
    }

    public WorkOrderResponseProjection linksToAdd(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linksToAdd").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection linksToRemove(LinkResponseProjection subProjection) {
        return linksToRemove(null, subProjection);
    }

    public WorkOrderResponseProjection linksToRemove(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linksToRemove").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection images(FileResponseProjection subProjection) {
        return images(null, subProjection);
    }

    public WorkOrderResponseProjection images(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection files(FileResponseProjection subProjection) {
        return files(null, subProjection);
    }

    public WorkOrderResponseProjection files(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection comments(CommentResponseProjection subProjection) {
        return comments(null, subProjection);
    }

    public WorkOrderResponseProjection comments(String alias, CommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection activities(ActivityResponseProjection subProjection) {
        return activities((String) null, subProjection);
    }

    public WorkOrderResponseProjection activities(String alias, ActivityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("activities").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection activities(WorkOrderActivitiesParametrizedInput input, ActivityResponseProjection subProjection) {
        return activities(null, input, subProjection);
    }

    public WorkOrderResponseProjection activities(String alias, WorkOrderActivitiesParametrizedInput input, ActivityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("activities").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public WorkOrderResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public WorkOrderResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public WorkOrderResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection checkListCategories(CheckListCategoryResponseProjection subProjection) {
        return checkListCategories(null, subProjection);
    }

    public WorkOrderResponseProjection checkListCategories(String alias, CheckListCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListCategories").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection hyperlinks(HyperlinkResponseProjection subProjection) {
        return hyperlinks(null, subProjection);
    }

    public WorkOrderResponseProjection hyperlinks(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinks").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection closeDate() {
        return closeDate(null);
    }

    public WorkOrderResponseProjection closeDate(String alias) {
        fields.add(new GraphQLResponseField("closeDate").alias(alias));
        return this;
    }


}
