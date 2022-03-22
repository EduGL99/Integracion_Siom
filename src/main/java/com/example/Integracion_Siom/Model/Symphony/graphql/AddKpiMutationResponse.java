package com.example.Integracion_Siom.Model.Symphony.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKpiMutationResponse extends GraphQLResult<Map<String, KpiTO>> {

    private static final String OPERATION_NAME = "addKpi";

    public AddKpiMutationResponse() {
    }

    public KpiTO addKpi() {
        Map<String, KpiTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
