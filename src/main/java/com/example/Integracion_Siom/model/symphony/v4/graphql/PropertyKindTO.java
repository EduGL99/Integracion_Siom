package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PropertyKindTO {

    @JsonProperty("string")
    STRING("string"),
    @JsonProperty("int")
    INT("int"),
    @JsonProperty("bool")
    BOOL("bool"),
    @JsonProperty("float")
    FLOAT("float"),
    @JsonProperty("date")
    DATE("date"),
    @JsonProperty("enum")
    ENUM("enum"),
    @JsonProperty("range")
    RANGE("range"),
    @JsonProperty("email")
    EMAIL("email"),
    @JsonProperty("gps_location")
    GPS_LOCATION("gps_location"),
    @JsonProperty("datetime_local")
    DATETIME_LOCAL("datetime_local"),
    @JsonProperty("node")
    NODE("node");

    private final String value;

    PropertyKindTO(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PropertyKindTO fromValue(String text) {
        for (PropertyKindTO b : PropertyKindTO.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
