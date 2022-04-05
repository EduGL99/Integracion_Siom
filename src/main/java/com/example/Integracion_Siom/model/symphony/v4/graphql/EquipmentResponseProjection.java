package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentResponseProjection extends GraphQLResponseProjection {

    public EquipmentResponseProjection() {
    }

    public EquipmentResponseProjection id() {
        return id(null);
    }

    public EquipmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentResponseProjection externalId() {
        return externalId(null);
    }

    public EquipmentResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public EquipmentResponseProjection name() {
        return name(null);
    }

    public EquipmentResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentResponseProjection parentLocation(LocationResponseProjection subProjection) {
        return parentLocation(null, subProjection);
    }

    public EquipmentResponseProjection parentLocation(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentLocation").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection parentPosition(EquipmentPositionResponseProjection subProjection) {
        return parentPosition(null, subProjection);
    }

    public EquipmentResponseProjection parentPosition(String alias, EquipmentPositionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentPosition").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection equipmentType(EquipmentTypeResponseProjection subProjection) {
        return equipmentType(null, subProjection);
    }

    public EquipmentResponseProjection equipmentType(String alias, EquipmentTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentType").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection positions(EquipmentPositionResponseProjection subProjection) {
        return positions(null, subProjection);
    }

    public EquipmentResponseProjection positions(String alias, EquipmentPositionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("positions").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports((String) null, subProjection);
    }

    public EquipmentResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection ports(EquipmentPortsParametrizedInput input, EquipmentPortResponseProjection subProjection) {
        return ports(null, input, subProjection);
    }

    public EquipmentResponseProjection ports(String alias, EquipmentPortsParametrizedInput input, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection descendentsIncludingSelf(EquipmentResponseProjection subProjection) {
        return descendentsIncludingSelf(null, subProjection);
    }

    public EquipmentResponseProjection descendentsIncludingSelf(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("descendentsIncludingSelf").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public EquipmentResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection futureState() {
        return futureState(null);
    }

    public EquipmentResponseProjection futureState(String alias) {
        fields.add(new GraphQLResponseField("futureState").alias(alias));
        return this;
    }

    public EquipmentResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public EquipmentResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection locationHierarchy(LocationResponseProjection subProjection) {
        return locationHierarchy(null, subProjection);
    }

    public EquipmentResponseProjection locationHierarchy(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locationHierarchy").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection firstLocation(LocationResponseProjection subProjection) {
        return firstLocation(null, subProjection);
    }

    public EquipmentResponseProjection firstLocation(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("firstLocation").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection positionHierarchy(EquipmentPositionResponseProjection subProjection) {
        return positionHierarchy(null, subProjection);
    }

    public EquipmentResponseProjection positionHierarchy(String alias, EquipmentPositionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("positionHierarchy").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public EquipmentResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection images(FileResponseProjection subProjection) {
        return images(null, subProjection);
    }

    public EquipmentResponseProjection images(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection files(FileResponseProjection subProjection) {
        return files(null, subProjection);
    }

    public EquipmentResponseProjection files(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection hyperlinks(HyperlinkResponseProjection subProjection) {
        return hyperlinks(null, subProjection);
    }

    public EquipmentResponseProjection hyperlinks(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinks").alias(alias).projection(subProjection));
        return this;
    }


}
