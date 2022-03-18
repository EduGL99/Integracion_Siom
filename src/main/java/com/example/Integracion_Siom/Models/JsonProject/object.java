package com.example.Integracion_Siom.Models.JsonProject;

public class object {
    String id;
    String href;
    String creationDate;
    String name;
    String priority;
    String ticketType;
    characteristic[] characteristic;
    checklist[] checklist;
    relatedParty[] relatedParty;
    String status;
    String baseType;
    String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public com.example.Integracion_Siom.Models.JsonProject.characteristic[] getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(com.example.Integracion_Siom.Models.JsonProject.characteristic[] characteristic) {
        this.characteristic = characteristic;
    }

    public com.example.Integracion_Siom.Models.JsonProject.checklist[] getChecklist() {
        return checklist;
    }

    public void setChecklist(com.example.Integracion_Siom.Models.JsonProject.checklist[] checklist) {
        this.checklist = checklist;
    }

    public com.example.Integracion_Siom.Models.JsonProject.relatedParty[] getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(com.example.Integracion_Siom.Models.JsonProject.relatedParty[] relatedParty) {
        this.relatedParty = relatedParty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
