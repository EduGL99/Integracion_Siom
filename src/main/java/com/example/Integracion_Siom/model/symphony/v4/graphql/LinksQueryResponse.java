package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinksQueryResponse extends GraphQLResult<Map<String, LinkConnectionTO>> {

    private static final String OPERATION_NAME = "links";

    public LinksQueryResponse() {
    }

    public LinkConnectionTO links() {
        Map<String, LinkConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
