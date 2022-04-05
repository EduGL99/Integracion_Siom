package com.example.Integracion_Siom.Controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseController {

    @JsonProperty("ServiceOrderId")
    private String ServiceOrderId;

    public ResponseController(ResponseController element){
        ServiceOrderId = element.getServiceOrderId();
    }

}
