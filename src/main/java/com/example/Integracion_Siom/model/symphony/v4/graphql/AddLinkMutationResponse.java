package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLinkMutationResponse extends GraphQLResult<Map<String, LinkTO>> {

    private static final String OPERATION_NAME = "addLink";

    public AddLinkMutationResponse() {
    }

    public LinkTO addLink() {
        Map<String, LinkTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
