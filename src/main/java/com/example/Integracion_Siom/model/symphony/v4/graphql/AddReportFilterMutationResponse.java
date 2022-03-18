package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddReportFilterMutationResponse extends GraphQLResult<Map<String, ReportFilterTO>> {

    private static final String OPERATION_NAME = "addReportFilter";

    public AddReportFilterMutationResponse() {
    }

    public ReportFilterTO addReportFilter() {
        Map<String, ReportFilterTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
