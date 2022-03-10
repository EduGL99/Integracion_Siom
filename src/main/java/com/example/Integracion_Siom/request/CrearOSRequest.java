package com.example.Integracion_Siom.request;

import com.example.Integracion_Siom.controller.TokenController;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;

@Slf4j
public class CrearOSRequest {


    private static String url_dir="http://10.225.236.230:17004/saacmovistarcommx-prod/t-open-api-temm/oauth2/v1/token";
    private static String access_token;
    /*
    public String request() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headersToken = new HttpHeaders();
        Token token = new Token();
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

     */
}
