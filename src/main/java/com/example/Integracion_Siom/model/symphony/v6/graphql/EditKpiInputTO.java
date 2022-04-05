package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditKpiInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String domainFk;
    @javax.validation.constraints.NotNull
    private String kpiCategoryFK;
    private boolean status;

    public EditKpiInputTO() {
    }

    public EditKpiInputTO(String id, String name, String description, String domainFk, String kpiCategoryFK, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.domainFk = domainFk;
        this.kpiCategoryFK = kpiCategoryFK;
        this.status = status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomainFk() {
        return domainFk;
    }

    public void setDomainFk(String domainFk) {
        this.domainFk = domainFk;
    }

    public String getKpiCategoryFK() {
        return kpiCategoryFK;
    }

    public void setKpiCategoryFK(String kpiCategoryFK) {
        this.kpiCategoryFK = kpiCategoryFK;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (domainFk != null) {
            joiner.add("domainFk: " + GraphQLRequestSerializer.getEntry(domainFk));
        }
        if (kpiCategoryFK != null) {
            joiner.add("kpiCategoryFK: " + GraphQLRequestSerializer.getEntry(kpiCategoryFK));
        }
        joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String domainFk;
        private String kpiCategoryFK;
        private boolean status;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDomainFk(String domainFk) {
            this.domainFk = domainFk;
            return this;
        }

        public Builder setKpiCategoryFK(String kpiCategoryFK) {
            this.kpiCategoryFK = kpiCategoryFK;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }


        public EditKpiInputTO build() {
            return new EditKpiInputTO(id, name, description, domainFk, kpiCategoryFK, status);
        }

    }
}
