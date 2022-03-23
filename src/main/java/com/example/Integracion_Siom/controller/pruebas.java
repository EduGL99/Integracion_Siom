package com.example.Integracion_Siom.controller;

import com.example.Integracion_Siom.Models.Group;
import com.example.Integracion_Siom.Models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.reflect.TypeToken;

@RestController
@RequestMapping("/prueba")
public class pruebas {

    @RequestMapping(value = "1",method = RequestMethod.GET)
    public void pruebajson() throws JsonProcessingException {
        String StringJson = "{\"user\":{\"id\":\"214748364805\",\"groups\":[{\"id\":\"219043332096\",\"name\":\"Gestión de Problemas\",\"description\":\"Grupo Gestión de Problemas\",\"status\":\"ACTIVE\",\"members\":[{\"id\":\"214748364805\"},{\"id\":\"214748364806\"},{\"id\":\"214748364807\"},{\"id\":\"214748364808\"},{\"id\":\"214748364809\"},{\"id\":\"214748364810\"}],\"policies\":[{\"id\":\"141733920768\"},{\"id\":\"141733920769\"}]}]}}";
        Gson json = new Gson();
        User user = json.fromJson(StringJson,User.class);
        System.out.println(user);
    }

    @RequestMapping(value = "2",method = RequestMethod.GET)
    public void aver(){
        String json = "{\n" +
                "  \"id\": \"214748364805\",\n" +
                "  \"groups\": [\n" +
                "    {\n" +
                "      \"id\": \"219043332096\",\n" +
                "      \"name\": \"Gestión de Problemas\",\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"219043332096\",\n" +
                "      \"name\": \"Gestión de Problemas\",\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        String json2 = "{\n" +
                "  \"id\": \"214748364805\",\n" +
                "  \"groups\": [\n" +
                "    {\n" +
                "      \"id\": \"219043332096\",\n" +
                "      \"name\": \"Gestión de Problemas\",\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"219043332096\",\n" +
                "      \"name\": \"Gestión de Problemas\",\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"characteristic\": [\n" +
                "    {\n" +
                "      \"id\": \"158914273885\",\n" +
                "      \"name\": \"keyFlow\",\n" +
                "      \"valueType\": \"string\",\n" +
                "      \"value\": \"Check_Project_Service\",\n" +
                "      \"@baseType\": \"propertyType\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        User groups = new Gson().fromJson(json2,User.class);
        String json3 = "{\n" +
                "      \"id\": \"219043332096\",\n" +
                "      \"name\": \"Gestión de Problemas\",\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    }";
        String json4 = "[\n" +
                "    {\n" +
                "      \"id\": \"219043332096\",\n" +
                "      \"name\": \"Gestión de Problemas\",\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"219043332096\",\n" +
                "      \"name\": \"Gestión de Problemas\",\n" +
                "      \"status\": \"ACTIVE\"\n" +
                "    }\n" +
                "  ]";
        Type listType = new TypeToken<ArrayList<Group>>(){}.getType();
        List<Group> yourClassList = new Gson().fromJson(json4, listType);
        System.out.println(yourClassList);
        Group groups1 = new Gson().fromJson(json3, Group.class);
        System.out.println(groups);
        System.out.println(groups1);
    }
}
