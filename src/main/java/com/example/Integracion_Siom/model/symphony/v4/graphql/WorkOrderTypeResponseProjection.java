package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTypeResponseProjection extends GraphQLResponseProjection {

    public WorkOrderTypeResponseProjection() {
    }

    public WorkOrderTypeResponseProjection id() {
        return id(null);
    }

    public WorkOrderTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection name() {
        return name(null);
    }

    public WorkOrderTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection description() {
        return description(null);
    }

    public WorkOrderTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public WorkOrderTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeResponseProjection numberOfWorkOrders() {
        return numberOfWorkOrders(null);
    }

    public WorkOrderTypeResponseProjection numberOfWorkOrders(String alias) {
        fields.add(new GraphQLResponseField("numberOfWorkOrders").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection checkListCategoryDefinitions(CheckListCategoryDefinitionResponseProjection subProjection) {
        return checkListCategoryDefinitions(null, subProjection);
    }

    public WorkOrderTypeResponseProjection checkListCategoryDefinitions(String alias, CheckListCategoryDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListCategoryDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeResponseProjection assigneeCanCompleteWorkOrder() {
        return assigneeCanCompleteWorkOrder(null);
    }

    public WorkOrderTypeResponseProjection assigneeCanCompleteWorkOrder(String alias) {
        fields.add(new GraphQLResponseField("assigneeCanCompleteWorkOrder").alias(alias));
        return this;
    }


}
