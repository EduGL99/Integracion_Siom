package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EndToEndPathQueryResponse extends GraphQLResult<Map<String, EndToEndPathTO>> {

    private static final String OPERATION_NAME = "endToEndPath";

    public EndToEndPathQueryResponse() {
    }

    public EndToEndPathTO endToEndPath() {
        Map<String, EndToEndPathTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
