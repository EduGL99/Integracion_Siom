package com.example.Integracion_Siom.model.symphony.v5.graphql;


public enum CellularNetworkTypeTO {

    CDMA("CDMA"),
    GSM("GSM"),
    LTE("LTE"),
    WCDMA("WCDMA");

    private final String graphqlName;

    private CellularNetworkTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
