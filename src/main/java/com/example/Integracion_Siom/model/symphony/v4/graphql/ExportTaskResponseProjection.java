package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExportTaskResponseProjection extends GraphQLResponseProjection {

    public ExportTaskResponseProjection() {
    }

    public ExportTaskResponseProjection id() {
        return id(null);
    }

    public ExportTaskResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection type() {
        return type(null);
    }

    public ExportTaskResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection status() {
        return status(null);
    }

    public ExportTaskResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection progress() {
        return progress(null);
    }

    public ExportTaskResponseProjection progress(String alias) {
        fields.add(new GraphQLResponseField("progress").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection filters(GeneralFilterResponseProjection subProjection) {
        return filters(null, subProjection);
    }

    public ExportTaskResponseProjection filters(String alias, GeneralFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filters").alias(alias).projection(subProjection));
        return this;
    }

    public ExportTaskResponseProjection storeKey() {
        return storeKey(null);
    }

    public ExportTaskResponseProjection storeKey(String alias) {
        fields.add(new GraphQLResponseField("storeKey").alias(alias));
        return this;
    }


}
