package com.example.Integracion_Siom.Model.Symphony.graphql;

/**
 * Appointment Status
 */

public enum AppointmentStatusTO {

    ACTIVE("ACTIVE"),
    CANCELED("CANCELED");

    private final String graphqlName;

    AppointmentStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
