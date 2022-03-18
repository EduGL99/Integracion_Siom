package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportFiltersQueryResponse extends GraphQLResult<Map<String, java.util.List<ReportFilterTO>>> {

    private static final String OPERATION_NAME = "reportFilters";

    public ReportFiltersQueryResponse() {
    }

    public java.util.List<ReportFilterTO> reportFilters() {
        Map<String, java.util.List<ReportFilterTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
