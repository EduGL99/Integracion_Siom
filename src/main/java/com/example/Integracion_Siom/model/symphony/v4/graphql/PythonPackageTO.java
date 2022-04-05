package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PythonPackageTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String version;
    @javax.validation.constraints.NotNull
    private String whlFileKey;
    @javax.validation.constraints.NotNull
    private String uploadTime;
    @javax.validation.constraints.NotNull
    private Boolean hasBreakingChange;

    public PythonPackageTO() {
    }

    public PythonPackageTO(String version, String whlFileKey, String uploadTime, Boolean hasBreakingChange) {
        this.version = version;
        this.whlFileKey = whlFileKey;
        this.uploadTime = uploadTime;
        this.hasBreakingChange = hasBreakingChange;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getWhlFileKey() {
        return whlFileKey;
    }

    public void setWhlFileKey(String whlFileKey) {
        this.whlFileKey = whlFileKey;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Boolean getHasBreakingChange() {
        return hasBreakingChange;
    }

    public void setHasBreakingChange(Boolean hasBreakingChange) {
        this.hasBreakingChange = hasBreakingChange;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
        }
        if (whlFileKey != null) {
            joiner.add("whlFileKey: " + GraphQLRequestSerializer.getEntry(whlFileKey));
        }
        if (uploadTime != null) {
            joiner.add("uploadTime: " + GraphQLRequestSerializer.getEntry(uploadTime));
        }
        if (hasBreakingChange != null) {
            joiner.add("hasBreakingChange: " + GraphQLRequestSerializer.getEntry(hasBreakingChange));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String version;
        private String whlFileKey;
        private String uploadTime;
        private Boolean hasBreakingChange;

        public Builder() {
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setWhlFileKey(String whlFileKey) {
            this.whlFileKey = whlFileKey;
            return this;
        }

        public Builder setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        public Builder setHasBreakingChange(Boolean hasBreakingChange) {
            this.hasBreakingChange = hasBreakingChange;
            return this;
        }


        public PythonPackageTO build() {
            return new PythonPackageTO(version, whlFileKey, uploadTime, hasBreakingChange);
        }

    }
}
