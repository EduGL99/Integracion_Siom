package com.example.Integracion_Siom.Model.Symphony.graphql;


public interface NamedNodeTO {

    /**
     * The id of the object.
     */
    @javax.validation.constraints.NotNull
    String getId();

    /**
     * The name of the object.
     */
    @javax.validation.constraints.NotNull
    String getName();

}
