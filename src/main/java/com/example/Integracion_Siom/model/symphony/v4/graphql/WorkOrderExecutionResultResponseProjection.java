package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderExecutionResultResponseProjection extends GraphQLResponseProjection {

    public WorkOrderExecutionResultResponseProjection() {
    }

    public WorkOrderExecutionResultResponseProjection id() {
        return id(null);
    }

    public WorkOrderExecutionResultResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection name() {
        return name(null);
    }

    public WorkOrderExecutionResultResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection equipmentAdded(EquipmentResponseProjection subProjection) {
        return equipmentAdded(null, subProjection);
    }

    public WorkOrderExecutionResultResponseProjection equipmentAdded(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentAdded").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection equipmentRemoved() {
        return equipmentRemoved(null);
    }

    public WorkOrderExecutionResultResponseProjection equipmentRemoved(String alias) {
        fields.add(new GraphQLResponseField("equipmentRemoved").alias(alias));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection linkAdded(LinkResponseProjection subProjection) {
        return linkAdded(null, subProjection);
    }

    public WorkOrderExecutionResultResponseProjection linkAdded(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linkAdded").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection linkRemoved() {
        return linkRemoved(null);
    }

    public WorkOrderExecutionResultResponseProjection linkRemoved(String alias) {
        fields.add(new GraphQLResponseField("linkRemoved").alias(alias));
        return this;
    }


}
