package com.example.Integracion_Siom.configuration.graphql;

import com.example.Integracion_Siom.Model.Querys.FragmentNode;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

public interface CustomGraphQLOperationRequest extends GraphQLOperationRequest {

    FragmentNode getInlineFragment();
}
