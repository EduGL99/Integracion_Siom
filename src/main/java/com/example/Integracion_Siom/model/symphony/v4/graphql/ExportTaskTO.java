package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExportTaskTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ExportTypeTO type;
    @javax.validation.constraints.NotNull
    private ExportStatusTO status;
    @javax.validation.constraints.NotNull
    private Double progress;
    @javax.validation.constraints.NotNull
    private java.util.List<GeneralFilterTO> filters;
    @javax.validation.constraints.NotNull
    private String storeKey;

    public ExportTaskTO() {
    }

    public ExportTaskTO(String id, ExportTypeTO type, ExportStatusTO status, Double progress, java.util.List<GeneralFilterTO> filters, String storeKey) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.progress = progress;
        this.filters = filters;
        this.storeKey = storeKey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExportTypeTO getType() {
        return type;
    }

    public void setType(ExportTypeTO type) {
        this.type = type;
    }

    public ExportStatusTO getStatus() {
        return status;
    }

    public void setStatus(ExportStatusTO status) {
        this.status = status;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public java.util.List<GeneralFilterTO> getFilters() {
        return filters;
    }

    public void setFilters(java.util.List<GeneralFilterTO> filters) {
        this.filters = filters;
    }

    public String getStoreKey() {
        return storeKey;
    }

    public void setStoreKey(String storeKey) {
        this.storeKey = storeKey;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (progress != null) {
            joiner.add("progress: " + GraphQLRequestSerializer.getEntry(progress));
        }
        if (filters != null) {
            joiner.add("filters: " + GraphQLRequestSerializer.getEntry(filters));
        }
        if (storeKey != null) {
            joiner.add("storeKey: " + GraphQLRequestSerializer.getEntry(storeKey));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private ExportTypeTO type;
        private ExportStatusTO status;
        private Double progress;
        private java.util.List<GeneralFilterTO> filters;
        private String storeKey;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setType(ExportTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setStatus(ExportStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setProgress(Double progress) {
            this.progress = progress;
            return this;
        }

        public Builder setFilters(java.util.List<GeneralFilterTO> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setStoreKey(String storeKey) {
            this.storeKey = storeKey;
            return this;
        }


        public ExportTaskTO build() {
            return new ExportTaskTO(id, type, status, progress, filters, storeKey);
        }

    }
}
