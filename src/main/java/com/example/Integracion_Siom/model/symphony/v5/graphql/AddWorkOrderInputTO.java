package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWorkOrderInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private String workOrderTypeId;
    private String locationId;
    private String projectId;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListItemInputTO> checkList;
    private String ownerId;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListCategoryInputTO> checkListCategories;
    private String assigneeId;
    private Integer index;
    private WorkOrderStatusTO status;
    private WorkOrderPriorityTO priority;

    public AddWorkOrderInputTO() {
    }

    public AddWorkOrderInputTO(String name, String description, String workOrderTypeId, String locationId, String projectId, java.util.List<PropertyInputTO> properties, java.util.List<CheckListItemInputTO> checkList, String ownerId, java.util.List<CheckListCategoryInputTO> checkListCategories, String assigneeId, Integer index, WorkOrderStatusTO status, WorkOrderPriorityTO priority) {
        this.name = name;
        this.description = description;
        this.workOrderTypeId = workOrderTypeId;
        this.locationId = locationId;
        this.projectId = projectId;
        this.properties = properties;
        this.checkList = checkList;
        this.ownerId = ownerId;
        this.checkListCategories = checkListCategories;
        this.assigneeId = assigneeId;
        this.index = index;
        this.status = status;
        this.priority = priority;
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

    public String getWorkOrderTypeId() {
        return workOrderTypeId;
    }

    public void setWorkOrderTypeId(String workOrderTypeId) {
        this.workOrderTypeId = workOrderTypeId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }

    public java.util.List<CheckListItemInputTO> getCheckList() {
        return checkList;
    }

    public void setCheckList(java.util.List<CheckListItemInputTO> checkList) {
        this.checkList = checkList;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public java.util.List<CheckListCategoryInputTO> getCheckListCategories() {
        return checkListCategories;
    }

    public void setCheckListCategories(java.util.List<CheckListCategoryInputTO> checkListCategories) {
        this.checkListCategories = checkListCategories;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public WorkOrderStatusTO getStatus() {
        return status;
    }

    public void setStatus(WorkOrderStatusTO status) {
        this.status = status;
    }

    public WorkOrderPriorityTO getPriority() {
        return priority;
    }

    public void setPriority(WorkOrderPriorityTO priority) {
        this.priority = priority;
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
        if (workOrderTypeId != null) {
            joiner.add("workOrderTypeId: " + GraphQLRequestSerializer.getEntry(workOrderTypeId));
        }
        if (locationId != null) {
            joiner.add("locationId: " + GraphQLRequestSerializer.getEntry(locationId));
        }
        if (projectId != null) {
            joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (checkList != null) {
            joiner.add("checkList: " + GraphQLRequestSerializer.getEntry(checkList));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (checkListCategories != null) {
            joiner.add("checkListCategories: " + GraphQLRequestSerializer.getEntry(checkListCategories));
        }
        if (assigneeId != null) {
            joiner.add("assigneeId: " + GraphQLRequestSerializer.getEntry(assigneeId));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (priority != null) {
            joiner.add("priority: " + GraphQLRequestSerializer.getEntry(priority));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String workOrderTypeId;
        private String locationId;
        private String projectId;
        private java.util.List<PropertyInputTO> properties;
        private java.util.List<CheckListItemInputTO> checkList;
        private String ownerId;
        private java.util.List<CheckListCategoryInputTO> checkListCategories;
        private String assigneeId;
        private Integer index;
        private WorkOrderStatusTO status;
        private WorkOrderPriorityTO priority;

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

        public Builder setWorkOrderTypeId(String workOrderTypeId) {
            this.workOrderTypeId = workOrderTypeId;
            return this;
        }

        public Builder setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setCheckList(java.util.List<CheckListItemInputTO> checkList) {
            this.checkList = checkList;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setCheckListCategories(java.util.List<CheckListCategoryInputTO> checkListCategories) {
            this.checkListCategories = checkListCategories;
            return this;
        }

        public Builder setAssigneeId(String assigneeId) {
            this.assigneeId = assigneeId;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setStatus(WorkOrderStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setPriority(WorkOrderPriorityTO priority) {
            this.priority = priority;
            return this;
        }


        public AddWorkOrderInputTO build() {
            return new AddWorkOrderInputTO(name, description, workOrderTypeId, locationId, projectId, properties, checkList, ownerId, checkListCategories, assigneeId, index, status, priority);
        }

    }
}
