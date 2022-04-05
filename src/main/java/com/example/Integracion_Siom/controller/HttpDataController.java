package com.example.Integracion_Siom.Controller;

import okhttp3.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
/*
@RestController
@RequestMapping("/request")*/
public class HttpDataController {

    //@RequestMapping(value = "prueba", method = RequestMethod.GET)
    public String Data() {

        TokenController tokenController = new TokenController();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");

        String codEspecialidad = "41";
        String idIngeniero = ""; // valor de prueba
        String nombreIngeniero = ""; //valor de prueba
        //String fechaSolicitud = "14-03-22 08:10:00"; valor de prueba
        String fechaSolicitud = dtf.format(LocalDateTime.now());
        String idSitio = "36717"; // valor de prueba
        String idProveedor = "62"; // valor de prueba
        String fechaCreacion = "14-03-22 08:05:00"; // valor de prueba
        String status = "SI";
        String detalles = "223338318566/SF2 Alta/Sin Afectacion/ TEMM MANZANILLO GTAC. | FIBRA EN RIESGO | SOLICITUD PE/Sin Afectacion||223338318566"; // valor de prueba
        /*
        if (proveedor = externo) {
            nombreIngeniero = "";
            idIngeniero = "";
            if (id_proveedor_asignado == 5 || id_proveedor_asignado == 4914) {
                idProveedor = "67";
            }
            if (id_proveedor_asignado == 2734) {
                idProveedor = "62";
            }
        }
        */
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\r\n    \"additionalData\":[\r\n        {\r\n            \"value\":\"2358111\",\r\n            \"key\":\"tag\"\r\n        },\r\n        {\r\n            \"value\":\"" + codEspecialidad + "\",\r\n            \"key\":\"subspecialityCode\"\r\n        },\r\n        {\r\n            \"key\":\"formulario\",\r\n            \"value\":\"461\"\r\n        },\r\n        {\r\n            \"key\":\"formulario\",\r\n            \"value\":\"462\"\r\n        },\r\n        {\r\n            \"key\":\"formulario\",\r\n            \"value\":\"464\"\r\n        }\r\n    ],\r\n    \"interactionDate\":\"" + fechaSolicitud + "\",\r\n    \"correlationId\":30,\r\n    \"type\":\"OSGU\",\r\n    \"appointment\":{\r\n        \"correlationId\":\"" + idSitio + "\",\r\n        \"relatedEntity\":[\r\n            {\r\n                \"@referredType\":\"@referredType\",\r\n                \"role\":\"companion\",\r\n                \"name\":\"" + nombreIngeniero + "\",\r\n                \"id\":\"" + idIngeniero + "\",\r\n                \"href\":\"href\"\r\n            },\r\n            {\r\n                \"@referredType\":\"@referredType\",\r\n                \"role\":\"leader\",\r\n                \"name\":\"" + nombreIngeniero + "\",\r\n                \"id\":\"" + idIngeniero + "\",\r\n                \"href\":\"href\"\r\n            },\r\n            {\r\n                \"@referredType\":\"@referredType\",\r\n                \"role\":\"dispatcher\",\r\n                \"name\":\"" + nombreIngeniero + "\",\r\n                \"id\":\"" + idIngeniero + "\",\r\n                \"href\":\"href\"\r\n            }\r\n        ],\r\n        \"interventionDetail\":{\r\n            \"duration\":1,\r\n            \"providerInfo\":{\r\n                \"providerCompany\":\"" + idProveedor + "\",\r\n                \"providerFullname\":\"providerFullName\"\r\n            },\r\n            \"estimatedDuration\":6\r\n        },\r\n        \"creationDate\":\"" + fechaCreacion + "\",\r\n        \"status\":\"" + status + "\"\r\n    },\r\n    \"description\":\"" + detalles + "\"\r\n}");
            Request request = new Request.Builder()
                    .url("https://api-saac.apiconnect.ibmcloud.com/saacmovistarcommx-prod/t-open-api-temm/equipmentSiteMaintenances/v1/serviceOrder")
                    .method("POST",body)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("user", "siom_dev")
                    .addHeader("password", "Siom_dev123")
                    .addHeader("Authorization", "Bearer " + tokenController.generarTokenWSO2())
                    .build();
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body()).string();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
