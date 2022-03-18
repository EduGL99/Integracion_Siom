package com.example.Integracion_Siom.model.symphony.v4.graphql;

public enum WorkOrderStatusTO {

    PLANNED,
    IN_PROGRESS,
    @Deprecated
    PENDING,
    SUBMITTED,
    CLOSED,
    @Deprecated
    DONE,
    BLOCKED,
    CANCELED,
    SUSPENDED

}