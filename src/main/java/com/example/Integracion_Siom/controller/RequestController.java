package com.example.Integracion_Siom.controller;

import com.example.Integracion_Siom.Models.Request;
import com.example.Integracion_Siom.model.tmfxxx.WorkTicket;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class RequestController {

    public Request CrearRequest(){
        Request request = new Request();

        // lista de valores especificos de additionalData
        List formularios = new ArrayList();
        formularios.add(461);
        formularios.add(462);
        formularios.add(464);

        request.setCont_id(1);
        request.setEmpl_id(1);
        request.setEmpr_id(1);
        request.setFormularios(formularios);
        request.setId_acompanante(null);
        request.setId_despachador(1);
        request.setId_jcuadrilla(1);
        request.setOrse_descripcion("");
        request.setOrse_fecha_creacion("");
        request.setOrse_fecha_solicitud("");
        request.setOrse_indisponibilidad("");
        request.setOrse_tag("2358111");
        request.setOrse_tipo("");
        request.setSube_id(1);
        request.setUsua_login_creador("siom_dev");
        request.setUsua_pass_creador("Siom_dev123");

        return request;
    }


    private static String url_dir="http://10.225.236.230:17004/saacmovistarcommx-prod/t-open-api-temm/oauth2/v1/token";
    private static String access_token;

    public String request() {
        
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headersToken = new HttpHeaders();
        TokenController token = new TokenController();
        ResponseEntity<String> response = null;
        HttpEntity<?> request=new HttpEntity<>(headersToken);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Autorization", "Bearer" + token.generarTokenWSO2());
        headers.add("user", "siom_dev");
        headers.add("password","Siom_dev123");
        headers.add("Content-Type","application/json");

        try {
            response = restTemplate.postForEntity(url_dir, request, String.class);
            JSONObject jsonObj;
            jsonObj = new JSONObject(response.getBody());
            access_token = (String) jsonObj.get("access_token");
            if (!access_token.equals("") && access_token != null) {
                return access_token;
            } else {
                return null;
            }
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
            log.info("\nHttpClientErrorException ");
            return null;
        } catch (HttpStatusCodeException e) {
            log.info("\nHttpStatusCodeException ");
            e.printStackTrace();
            return null;
        } catch (JSONException e) {
            log.info("\nJSONException");
            e.printStackTrace();
            return null;
        }
    }
}
