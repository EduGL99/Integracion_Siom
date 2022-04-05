package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryPointInputTO implements java.io.Serializable {

    private EntryPointRoleTO role;
    private String cid;

    public EntryPointInputTO() {
    }

    public EntryPointInputTO(EntryPointRoleTO role, String cid) {
        this.role = role;
        this.cid = cid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EntryPointRoleTO getRole() {
        return role;
    }

    public void setRole(EntryPointRoleTO role) {
        this.role = role;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (cid != null) {
            joiner.add("cid: " + GraphQLRequestSerializer.getEntry(cid));
        }
        return joiner.toString();
    }

    public static class Builder {

        private EntryPointRoleTO role;
        private String cid;

        public Builder() {
        }

        public Builder setRole(EntryPointRoleTO role) {
            this.role = role;
            return this;
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }


        public EntryPointInputTO build() {
            return new EntryPointInputTO(role, cid);
        }

    }
}
