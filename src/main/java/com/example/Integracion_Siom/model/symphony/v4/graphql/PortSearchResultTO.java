package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortTO> ports;
    @javax.validation.constraints.NotNull
    private Integer count;

    public PortSearchResultTO() {
    }

    public PortSearchResultTO(java.util.List<EquipmentPortTO> ports, Integer count) {
        this.ports = ports;
        this.count = count;
    }

    public java.util.List<EquipmentPortTO> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<EquipmentPortTO> ports) {
        this.ports = ports;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ports != null) {
            joiner.add("ports: " + GraphQLRequestSerializer.getEntry(ports));
        }
        if (count != null) {
            joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private java.util.List<EquipmentPortTO> ports;
        private Integer count;

        public Builder() {
        }

        public Builder setPorts(java.util.List<EquipmentPortTO> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public PortSearchResultTO build() {
            return new PortSearchResultTO(ports, count);
        }

    }
}
