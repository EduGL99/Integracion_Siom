package com.example.Integracion_Siom.Models;

public class WorkOrder {
    String Id;
    String State;
    String IdPersonal;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getIdPersonal() {
        return IdPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        IdPersonal = idPersonal;
    }

    public WorkOrder(String id, String state, String idPersonal) {
        Id = id;
        State = state;
        IdPersonal = idPersonal;
    }
}
