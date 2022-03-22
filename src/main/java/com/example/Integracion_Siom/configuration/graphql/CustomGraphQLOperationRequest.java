package com.example.Integracion_Siom.configuration.graphql;

import com.everis.adapters.model.symphony.FragmentNode;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

public interface CustomGraphQLOperationRequest extends GraphQLOperationRequest {

    FragmentNode getInlineFragment();
}
