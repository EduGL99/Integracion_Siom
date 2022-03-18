package com.example.Integracion_Siom.model.symphony.v5.graphql;

/**
 * what filters should we apply on permissionsPolicy
 */

public enum PermissionsPolicyFilterTypeTO {

    PERMISSIONS_POLICY_NAME("PERMISSIONS_POLICY_NAME");

    private final String graphqlName;

    private PermissionsPolicyFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
