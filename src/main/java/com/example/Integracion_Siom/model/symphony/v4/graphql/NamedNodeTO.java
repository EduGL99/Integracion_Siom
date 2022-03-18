package com.example.Integracion_Siom.model.symphony.v4.graphql;


public interface NamedNodeTO {

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    String getName();

}