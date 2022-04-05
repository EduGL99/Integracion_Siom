package com.example.Integracion_Siom.model.symphony.v4;

import com.example.Integracion_Siom.model.symphony.v4.graphql.VariableDefinitionTO;

/**
 * Resolver for VariableDefinition
 */
public interface VariableDefinitionResolver {

    @javax.validation.constraints.NotNull
    java.util.List<VariableDefinitionTO> nestedVariables(VariableDefinitionTO variableDefinitionTO, String value) throws Exception;

}