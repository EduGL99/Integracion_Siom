package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * Properties by which project connections can be ordered.
 */

public enum ProjectOrderFieldTO {

    /**
     * Order projects by name.
     */
    NAME("NAME"),
    /**
     * Order projects by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order projects by update time.
     */
    UPDATED_AT("UPDATED_AT"),
    /**
     * Order projects by priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * Order projects by property type.
     */
    PROPERTY("PROPERTY");

    private final String graphqlName;

    private ProjectOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
