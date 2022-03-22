package com.example.Integracion_Siom.Model.Symphony.graphql;

/**
 * Properties by which formulas connections can be ordered.
 */

public enum FormulaOrderFieldTO {

    /**
     * Order formulas by name.
     */
    NAME("NAME"),
    /**
     * Order formulas by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order formulas by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    FormulaOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
