package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddProjectTypeInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeInputTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<WorkOrderDefinitionInputTO> workOrders;

    public AddProjectTypeInputTO() {
    }

    public AddProjectTypeInputTO(String name, String description, java.util.List<PropertyTypeInputTO> properties, java.util.List<WorkOrderDefinitionInputTO> workOrders) {
        this.name = name;
        this.description = description;
        this.properties = properties;
        this.workOrders = workOrders;
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

    public java.util.List<PropertyTypeInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTypeInputTO> properties) {
        this.properties = properties;
    }

    public java.util.List<WorkOrderDefinitionInputTO> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(java.util.List<WorkOrderDefinitionInputTO> workOrders) {
        this.workOrders = workOrders;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (workOrders != null) {
            joiner.add("workOrders: " + GraphQLRequestSerializer.getEntry(workOrders));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<PropertyTypeInputTO> properties;
        private java.util.List<WorkOrderDefinitionInputTO> workOrders;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTypeInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setWorkOrders(java.util.List<WorkOrderDefinitionInputTO> workOrders) {
            this.workOrders = workOrders;
            return this;
        }


        public AddProjectTypeInputTO build() {
            return new AddProjectTypeInputTO(name, description, properties, workOrders);
        }

    }
}
