package com.example.Integracion_Siom.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @JsonProperty("id")
    private String id;

    @JsonProperty("groups")
    private List<Group> groups;

    //@JsonProperty("characteristic")
    //private List<Characteristic> characteristic;

    public User(User element) {
        id = element.getId();
        groups = element.getGroups();
        //characteristic = element.getCharacteristic();
    }

}
