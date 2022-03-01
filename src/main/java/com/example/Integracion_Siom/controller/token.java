package com.example.Integracion_Siom.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;

@Slf4j
public class token {

    private static String access_token="";
    private static String grant_type="";
    private static String scope="all";

    private static String client_id="";
    private static String client_secret="";
    private static String url_dir="";

    public String generarToken(){
        RestTemplate restTemplate = new RestTemplate();

        //creacion de header para solicitar token
        HttpHeaders headersToken = new org.springframework.http.HttpHeaders();
        headersToken.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headersToken.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        //crea requestToken para solicitar token
        MultiValueMap<String, String> requestToken = null;
        requestToken = new LinkedMultiValueMap<>();
        requestToken.add("grant_type", grant_type);
        requestToken.add("client_id", client_id);
        requestToken.add("client_secret", client_secret);
        requestToken.add("scope", scope);

        //crea	HttpEntity para crear un request con requestToken y headersToken para poder enviarlo
        HttpEntity<?> request = new HttpEntity<>(requestToken, headersToken);
        ResponseEntity<String> response = null;

        try {
            // envia mediante restamplate y solicitar el token
            response = restTemplate.postForEntity(url_dir, request, String.class);
            JSONObject jsonObj;
            jsonObj = new JSONObject(response.getBody());

            // se obtiene el token para usarlo en una variable global
            access_token = (String) jsonObj.get("access_token");

            // si el token es diferente de vacio o nulo retorna el token en caso contrario regresa null
            if (!access_token.equals("") && access_token != null) {
                return access_token;
            } else {
                return null;
            }

        // error por medio del http
        } catch (HttpClientErrorException e) {
            e.printStackTrace();
            log.info("\nHttpClientErrorException ");
            return null;
        // error por medio de la respuesta del restemplate
        } catch (HttpStatusCodeException e) {
            log.info("\nHttpStatusCodeException ");
            e.printStackTrace();
            return null;
        // error del Json
        } catch (JSONException e) {
            log.info("\nJSONException");
            e.printStackTrace();
            return null;
        }
    }
}
