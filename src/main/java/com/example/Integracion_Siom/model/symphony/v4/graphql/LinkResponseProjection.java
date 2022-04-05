package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkResponseProjection extends GraphQLResponseProjection {

    public LinkResponseProjection() {
    }

    public LinkResponseProjection id() {
        return id(null);
    }

    public LinkResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LinkResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports(null, subProjection);
    }

    public LinkResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public LinkResponseProjection futureState() {
        return futureState(null);
    }

    public LinkResponseProjection futureState(String alias) {
        fields.add(new GraphQLResponseField("futureState").alias(alias));
        return this;
    }

    public LinkResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public LinkResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public LinkResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public LinkResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public LinkResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public LinkResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }


}
