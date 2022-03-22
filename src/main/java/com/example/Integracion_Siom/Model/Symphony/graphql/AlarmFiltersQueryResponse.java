package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of AlarmFilter.
 */

public class AlarmFiltersQueryResponse extends GraphQLResult<Map<String, AlarmFilterConnectionTO>> {

    private static final String OPERATION_NAME = "alarmFilters";

    public AlarmFiltersQueryResponse() {
    }

    /**
     * A list of AlarmFilter.
     */
    public AlarmFilterConnectionTO alarmFilters() {
        Map<String, AlarmFilterConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
