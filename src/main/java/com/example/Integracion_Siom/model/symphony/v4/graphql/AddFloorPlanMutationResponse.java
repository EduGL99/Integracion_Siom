package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddFloorPlanMutationResponse extends GraphQLResult<Map<String, FloorPlanTO>> {

    private static final String OPERATION_NAME = "addFloorPlan";

    public AddFloorPlanMutationResponse() {
    }

    public FloorPlanTO addFloorPlan() {
        Map<String, FloorPlanTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
