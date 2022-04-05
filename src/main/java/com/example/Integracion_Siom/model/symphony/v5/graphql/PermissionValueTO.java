package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum PermissionValueTO {

    YES("YES"),
    NO("NO"),
    BY_CONDITION("BY_CONDITION");

    private final String graphqlName;

    private PermissionValueTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
