package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWiFiScansMutationResponse extends GraphQLResult<Map<String, java.util.List<SurveyWiFiScanTO>>> {

    private static final String OPERATION_NAME = "addWiFiScans";

    public AddWiFiScansMutationResponse() {
    }

    public java.util.List<SurveyWiFiScanTO> addWiFiScans() {
        Map<String, java.util.List<SurveyWiFiScanTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
