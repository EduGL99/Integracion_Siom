package com.example.Integracion_Siom.model.symphony.v5.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddReportFilterMutationResponse extends GraphQLResult<Map<String, ReportFilterTO>> {

    private static final String OPERATION_NAME = "addReportFilter";

    public AddReportFilterMutationResponse() {
    }

    public ReportFilterTO addReportFilter() {
        Map<String, ReportFilterTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
