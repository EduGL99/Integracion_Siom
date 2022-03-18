package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddDomainMutationResponse extends GraphQLResult<Map<String, DomainTO>> {

    private static final String OPERATION_NAME = "addDomain";

    public AddDomainMutationResponse() {
    }

    public DomainTO addDomain() {
        Map<String, DomainTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
