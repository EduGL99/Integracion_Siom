package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddImageMutationResponse extends GraphQLResult<Map<String, FileTO>> {

    private static final String OPERATION_NAME = "addImage";

    public AddImageMutationResponse() {
    }

    public FileTO addImage() {
        Map<String, FileTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
