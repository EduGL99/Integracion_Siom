package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Activity
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityResponseProjection extends GraphQLResponseProjection {

    public ActivityResponseProjection() {
    }

    public ActivityResponseProjection id() {
        return id(null);
    }

    public ActivityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActivityResponseProjection author(UserResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public ActivityResponseProjection author(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection isCreate() {
        return isCreate(null);
    }

    public ActivityResponseProjection isCreate(String alias) {
        fields.add(new GraphQLResponseField("isCreate").alias(alias));
        return this;
    }

    public ActivityResponseProjection activityType() {
        return activityType(null);
    }

    public ActivityResponseProjection activityType(String alias) {
        fields.add(new GraphQLResponseField("activityType").alias(alias));
        return this;
    }

    public ActivityResponseProjection newRelatedNode() {
        return newRelatedNode(null);
    }

    public ActivityResponseProjection newRelatedNode(String alias) {
        fields.add(new GraphQLResponseField("newRelatedNode").alias(alias));
        return this;
    }

    public ActivityResponseProjection oldRelatedNode() {
        return oldRelatedNode(null);
    }

    public ActivityResponseProjection oldRelatedNode(String alias) {
        fields.add(new GraphQLResponseField("oldRelatedNode").alias(alias));
        return this;
    }

    public ActivityResponseProjection oldValue() {
        return oldValue(null);
    }

    public ActivityResponseProjection oldValue(String alias) {
        fields.add(new GraphQLResponseField("oldValue").alias(alias));
        return this;
    }

    public ActivityResponseProjection newValue() {
        return newValue(null);
    }

    public ActivityResponseProjection newValue(String alias) {
        fields.add(new GraphQLResponseField("newValue").alias(alias));
        return this;
    }

    public ActivityResponseProjection createTime() {
        return createTime(null);
    }

    public ActivityResponseProjection createTime(String alias) {
        fields.add(new GraphQLResponseField("createTime").alias(alias));
        return this;
    }

    public ActivityResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public ActivityResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection clockDetails(ClockDetailsResponseProjection subProjection) {
        return clockDetails(null, subProjection);
    }

    public ActivityResponseProjection clockDetails(String alias, ClockDetailsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("clockDetails").alias(alias).projection(subProjection));
        return this;
    }


}
