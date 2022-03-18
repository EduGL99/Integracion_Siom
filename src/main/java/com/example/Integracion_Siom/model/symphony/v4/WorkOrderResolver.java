package com.example.Integracion_Siom.model.symphony.v4;

import com.example.Integracion_Siom.model.symphony.v4.graphql.ActivityFilterInputTO;
import com.example.Integracion_Siom.model.symphony.v4.graphql.ActivityTO;
import com.example.Integracion_Siom.model.symphony.v4.graphql.WorkOrderTO;

/**
 * Resolver for WorkOrder
 */
public interface WorkOrderResolver {

    @javax.validation.constraints.NotNull
    java.util.List<ActivityTO> activities(WorkOrderTO workOrderTO, ActivityFilterInputTO filter) throws Exception;

}