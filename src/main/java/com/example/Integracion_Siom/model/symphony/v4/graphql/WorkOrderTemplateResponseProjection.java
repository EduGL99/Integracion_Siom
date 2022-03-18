package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTemplateResponseProjection extends GraphQLResponseProjection {

    public WorkOrderTemplateResponseProjection() {
    }

    public WorkOrderTemplateResponseProjection name() {
        return name(null);
    }

    public WorkOrderTemplateResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderTemplateResponseProjection description() {
        return description(null);
    }

    public WorkOrderTemplateResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public WorkOrderTemplateResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public WorkOrderTemplateResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTemplateResponseProjection checkListCategoryDefinitions(CheckListCategoryDefinitionResponseProjection subProjection) {
        return checkListCategoryDefinitions(null, subProjection);
    }

    public WorkOrderTemplateResponseProjection checkListCategoryDefinitions(String alias, CheckListCategoryDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListCategoryDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTemplateResponseProjection assigneeCanCompleteWorkOrder() {
        return assigneeCanCompleteWorkOrder(null);
    }

    public WorkOrderTemplateResponseProjection assigneeCanCompleteWorkOrder(String alias) {
        fields.add(new GraphQLResponseField("assigneeCanCompleteWorkOrder").alias(alias));
        return this;
    }


}
