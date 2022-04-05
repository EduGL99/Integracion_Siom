package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class TechnicianWorkOrderCheckInMutationResponse extends GraphQLResult<Map<String, WorkOrderTO>> {

    private static final String OPERATION_NAME = "technicianWorkOrderCheckIn";

    public TechnicianWorkOrderCheckInMutationResponse() {
    }

    public WorkOrderTO technicianWorkOrderCheckIn() {
        Map<String, WorkOrderTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
