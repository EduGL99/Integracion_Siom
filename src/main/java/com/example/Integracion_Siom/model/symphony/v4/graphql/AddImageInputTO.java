package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddImageInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ImageEntityTO entityType;
    @javax.validation.constraints.NotNull
    private String entityId;
    @javax.validation.constraints.NotNull
    private String imgKey;
    @javax.validation.constraints.NotNull
    private String fileName;
    @javax.validation.constraints.NotNull
    private Integer fileSize;
    @javax.validation.constraints.NotNull
    private String modified;
    @javax.validation.constraints.NotNull
    private String contentType;
    private String category;
    private String annotation;

    public AddImageInputTO() {
    }

    public AddImageInputTO(ImageEntityTO entityType, String entityId, String imgKey, String fileName, Integer fileSize, String modified, String contentType, String category, String annotation) {
        this.entityType = entityType;
        this.entityId = entityId;
        this.imgKey = imgKey;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.modified = modified;
        this.contentType = contentType;
        this.category = category;
        this.annotation = annotation;
    }

    public ImageEntityTO getEntityType() {
        return entityType;
    }

    public void setEntityType(ImageEntityTO entityType) {
        this.entityType = entityType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getImgKey() {
        return imgKey;
    }

    public void setImgKey(String imgKey) {
        this.imgKey = imgKey;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityType != null) {
            joiner.add("entityType: " + GraphQLRequestSerializer.getEntry(entityType));
        }
        if (entityId != null) {
            joiner.add("entityId: " + GraphQLRequestSerializer.getEntry(entityId));
        }
        if (imgKey != null) {
            joiner.add("imgKey: " + GraphQLRequestSerializer.getEntry(imgKey));
        }
        if (fileName != null) {
            joiner.add("fileName: " + GraphQLRequestSerializer.getEntry(fileName));
        }
        if (fileSize != null) {
            joiner.add("fileSize: " + GraphQLRequestSerializer.getEntry(fileSize));
        }
        if (modified != null) {
            joiner.add("modified: " + GraphQLRequestSerializer.getEntry(modified));
        }
        if (contentType != null) {
            joiner.add("contentType: " + GraphQLRequestSerializer.getEntry(contentType));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        if (annotation != null) {
            joiner.add("annotation: " + GraphQLRequestSerializer.getEntry(annotation));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private ImageEntityTO entityType;
        private String entityId;
        private String imgKey;
        private String fileName;
        private Integer fileSize;
        private String modified;
        private String contentType;
        private String category;
        private String annotation;

        public Builder() {
        }

        public Builder setEntityType(ImageEntityTO entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder setImgKey(String imgKey) {
            this.imgKey = imgKey;
            return this;
        }

        public Builder setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Builder setModified(String modified) {
            this.modified = modified;
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }


        public AddImageInputTO build() {
            return new AddImageInputTO(entityType, entityId, imgKey, fileName, fileSize, modified, contentType, category, annotation);
        }

    }
}
