package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CheckListItemEnumSelectionModeTO {

    @JsonProperty("single")
    SINGLE("single"),
    @JsonProperty("multiple")
    MULTIPLE("multiple");

    private final String value;

    CheckListItemEnumSelectionModeTO(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CheckListItemEnumSelectionModeTO fromValue(String text) {
        for (CheckListItemEnumSelectionModeTO b : CheckListItemEnumSelectionModeTO.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}