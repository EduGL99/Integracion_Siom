package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileResponseProjection extends GraphQLResponseProjection {

    public FileResponseProjection() {
    }

    public FileResponseProjection id() {
        return id(null);
    }

    public FileResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FileResponseProjection fileName() {
        return fileName(null);
    }

    public FileResponseProjection fileName(String alias) {
        fields.add(new GraphQLResponseField("fileName").alias(alias));
        return this;
    }

    public FileResponseProjection sizeInBytes() {
        return sizeInBytes(null);
    }

    public FileResponseProjection sizeInBytes(String alias) {
        fields.add(new GraphQLResponseField("sizeInBytes").alias(alias));
        return this;
    }

    public FileResponseProjection modified() {
        return modified(null);
    }

    public FileResponseProjection modified(String alias) {
        fields.add(new GraphQLResponseField("modified").alias(alias));
        return this;
    }

    public FileResponseProjection uploaded() {
        return uploaded(null);
    }

    public FileResponseProjection uploaded(String alias) {
        fields.add(new GraphQLResponseField("uploaded").alias(alias));
        return this;
    }

    public FileResponseProjection fileType() {
        return fileType(null);
    }

    public FileResponseProjection fileType(String alias) {
        fields.add(new GraphQLResponseField("fileType").alias(alias));
        return this;
    }

    public FileResponseProjection mimeType() {
        return mimeType(null);
    }

    public FileResponseProjection mimeType(String alias) {
        fields.add(new GraphQLResponseField("mimeType").alias(alias));
        return this;
    }

    public FileResponseProjection storeKey() {
        return storeKey(null);
    }

    public FileResponseProjection storeKey(String alias) {
        fields.add(new GraphQLResponseField("storeKey").alias(alias));
        return this;
    }

    public FileResponseProjection category() {
        return category(null);
    }

    public FileResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public FileResponseProjection annotation() {
        return annotation(null);
    }

    public FileResponseProjection annotation(String alias) {
        fields.add(new GraphQLResponseField("annotation").alias(alias));
        return this;
    }


}
