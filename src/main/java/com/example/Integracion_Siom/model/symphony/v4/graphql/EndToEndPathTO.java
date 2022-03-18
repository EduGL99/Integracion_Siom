package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EndToEndPathTO implements java.io.Serializable {

    private java.util.List<LinkTO> links;
    private java.util.List<EquipmentPortTO> ports;

    public EndToEndPathTO() {
    }

    public EndToEndPathTO(java.util.List<LinkTO> links, java.util.List<EquipmentPortTO> ports) {
        this.links = links;
        this.ports = ports;
    }

    public java.util.List<LinkTO> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<LinkTO> links) {
        this.links = links;
    }

    public java.util.List<EquipmentPortTO> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<EquipmentPortTO> ports) {
        this.ports = ports;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (links != null) {
            joiner.add("links: " + GraphQLRequestSerializer.getEntry(links));
        }
        if (ports != null) {
            joiner.add("ports: " + GraphQLRequestSerializer.getEntry(ports));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private java.util.List<LinkTO> links;
        private java.util.List<EquipmentPortTO> ports;

        public Builder() {
        }

        public Builder setLinks(java.util.List<LinkTO> links) {
            this.links = links;
            return this;
        }

        public Builder setPorts(java.util.List<EquipmentPortTO> ports) {
            this.ports = ports;
            return this;
        }


        public EndToEndPathTO build() {
            return new EndToEndPathTO(links, ports);
        }

    }
}
