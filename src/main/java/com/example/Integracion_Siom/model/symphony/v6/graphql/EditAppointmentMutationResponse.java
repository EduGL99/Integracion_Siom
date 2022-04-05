package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditAppointmentMutationResponse extends GraphQLResult<Map<String, AppointmentTO>> {

    private static final String OPERATION_NAME = "editAppointment";

    public EditAppointmentMutationResponse() {
    }

    public AppointmentTO editAppointment() {
        Map<String, AppointmentTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
