package com.example.Integracion_Siom.model.tmfxxx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventSubscription {
    @JsonProperty("id")
    private String id;

    @JsonProperty("callback")
    private String callback;

    @JsonProperty("query")
    private String query;
}
