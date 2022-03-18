package com.example.Integracion_Siom.service.inter;

import com.example.Integracion_Siom.model.symphony.v6.graphql.UserTO;
import com.example.Integracion_Siom.model.tmfxxx.WorkTicket;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.Map;

public interface SimphonyUserInterface {

    UserTO get(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException;
}
