package com.example.Integracion_Siom.Controller;

import com.example.Integracion_Siom.model.tmfxxx.WorkTicket;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/request")
public class RequestController {

    //private static String url_dir="http://10.225.236.230:17004/saacmovistarcommx-prod/t-open-api-temm/equipmentSiteMaintenances/v1/serviceOrder";

    private static String url_dir="https://api-saac.apiconnect.ibmcloud.com/saacmovistarcommx-prod/t-open-api-temm/equipmentSiteMaintenances/v1/serviceOrder";
    private static String ServiceOrderId ="";

    @RequestMapping(value = "token", method = RequestMethod.GET)
    public String request(WorkTicket workTicket) {

        RestTemplate restTemplate = new RestTemplate();
        TokenController tokenController = new TokenController();
        HttpDataController httpData = new HttpDataController();

        ResponseController responseController=new ResponseController();
        String serviceOrderJson = responseController.getServiceOrderId();
        ResponseController serviceOrder = new Gson().fromJson(serviceOrderJson, ResponseController.class);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Autorization", "Bearer "+tokenController.generarTokenWSO2());
        headers.add("user", "siom_dev");
        headers.add("password", "Siom_dev123");
        headers.add("Content-Type", "application/json");

        HttpEntity<?> request = new HttpEntity<>(httpData.Data(),headers);

        try {
            JSONObject jsonObj;
            jsonObj = new JSONObject(httpData.Data());
            ServiceOrderId = jsonObj.getString("ServiceOrderId");
            if (!ServiceOrderId.equals("") && ServiceOrderId != null) {
                return ServiceOrderId;
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
