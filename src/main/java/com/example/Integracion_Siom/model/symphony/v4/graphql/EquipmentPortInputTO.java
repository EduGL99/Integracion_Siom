package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortInputTO implements java.io.Serializable {

    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private Integer index;
    private String visibleLabel;
    private String portTypeID;
    private String bandwidth;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortConnectionInputTO> connectedPorts;

    public EquipmentPortInputTO() {
    }

    public EquipmentPortInputTO(String id, String name, Integer index, String visibleLabel, String portTypeID, String bandwidth, java.util.List<EquipmentPortConnectionInputTO> connectedPorts) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.visibleLabel = visibleLabel;
        this.portTypeID = portTypeID;
        this.bandwidth = bandwidth;
        this.connectedPorts = connectedPorts;
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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getVisibleLabel() {
        return visibleLabel;
    }

    public void setVisibleLabel(String visibleLabel) {
        this.visibleLabel = visibleLabel;
    }

    public String getPortTypeID() {
        return portTypeID;
    }

    public void setPortTypeID(String portTypeID) {
        this.portTypeID = portTypeID;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public java.util.List<EquipmentPortConnectionInputTO> getConnectedPorts() {
        return connectedPorts;
    }

    public void setConnectedPorts(java.util.List<EquipmentPortConnectionInputTO> connectedPorts) {
        this.connectedPorts = connectedPorts;
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
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (visibleLabel != null) {
            joiner.add("visibleLabel: " + GraphQLRequestSerializer.getEntry(visibleLabel));
        }
        if (portTypeID != null) {
            joiner.add("portTypeID: " + GraphQLRequestSerializer.getEntry(portTypeID));
        }
        if (bandwidth != null) {
            joiner.add("bandwidth: " + GraphQLRequestSerializer.getEntry(bandwidth));
        }
        if (connectedPorts != null) {
            joiner.add("connectedPorts: " + GraphQLRequestSerializer.getEntry(connectedPorts));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private Integer index;
        private String visibleLabel;
        private String portTypeID;
        private String bandwidth;
        private java.util.List<EquipmentPortConnectionInputTO> connectedPorts;

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

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setVisibleLabel(String visibleLabel) {
            this.visibleLabel = visibleLabel;
            return this;
        }

        public Builder setPortTypeID(String portTypeID) {
            this.portTypeID = portTypeID;
            return this;
        }

        public Builder setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder setConnectedPorts(java.util.List<EquipmentPortConnectionInputTO> connectedPorts) {
            this.connectedPorts = connectedPorts;
            return this;
        }


        public EquipmentPortInputTO build() {
            return new EquipmentPortInputTO(id, name, index, visibleLabel, portTypeID, bandwidth, connectedPorts);
        }

    }
}
