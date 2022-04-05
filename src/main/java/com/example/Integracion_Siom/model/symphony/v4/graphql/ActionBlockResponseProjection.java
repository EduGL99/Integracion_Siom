package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionBlockResponseProjection extends GraphQLResponseProjection {

    public ActionBlockResponseProjection() {
    }

    public ActionBlockResponseProjection actionType(ActionTypeResponseProjection subProjection) {
        return actionType(null, subProjection);
    }

    public ActionBlockResponseProjection actionType(String alias, ActionTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actionType").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection params(VariableExpressionResponseProjection subProjection) {
        return params(null, subProjection);
    }

    public ActionBlockResponseProjection params(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("params").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public ActionBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public ActionBlockResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection workOrderType(WorkOrderTypeResponseProjection subProjection) {
        return workOrderType(null, subProjection);
    }

    public ActionBlockResponseProjection workOrderType(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrderType").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection workerType(WorkerTypeResponseProjection subProjection) {
        return workerType(null, subProjection);
    }

    public ActionBlockResponseProjection workerType(String alias, WorkerTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workerType").alias(alias).projection(subProjection));
        return this;
    }


}
