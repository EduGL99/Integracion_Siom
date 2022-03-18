package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowInstanceResponseProjection extends GraphQLResponseProjection {

    public FlowInstanceResponseProjection() {
    }

    public FlowInstanceResponseProjection id() {
        return id(null);
    }

    public FlowInstanceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection bssCode() {
        return bssCode(null);
    }

    public FlowInstanceResponseProjection bssCode(String alias) {
        fields.add(new GraphQLResponseField("bssCode").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection serviceInstanceCode() {
        return serviceInstanceCode(null);
    }

    public FlowInstanceResponseProjection serviceInstanceCode(String alias) {
        fields.add(new GraphQLResponseField("serviceInstanceCode").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection status() {
        return status(null);
    }

    public FlowInstanceResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection template(FlowExecutionTemplateResponseProjection subProjection) {
        return template(null, subProjection);
    }

    public FlowInstanceResponseProjection template(String alias, FlowExecutionTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("template").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceResponseProjection blocks(BlockInstanceResponseProjection subProjection) {
        return blocks(null, subProjection);
    }

    public FlowInstanceResponseProjection blocks(String alias, BlockInstanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blocks").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceResponseProjection startDate() {
        return startDate(null);
    }

    public FlowInstanceResponseProjection startDate(String alias) {
        fields.add(new GraphQLResponseField("startDate").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection endDate() {
        return endDate(null);
    }

    public FlowInstanceResponseProjection endDate(String alias) {
        fields.add(new GraphQLResponseField("endDate").alias(alias));
        return this;
    }


}
