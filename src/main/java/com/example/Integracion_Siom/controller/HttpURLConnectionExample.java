package com.example.Integracion_Siom.controller;

import okhttp3.*;

import javax.net.ssl.*;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.Objects;

import static com.example.Integracion_Siom.Models.GetUnsafeOkHttpClient.getUnsafeOkHttpClient;

public class HttpURLConnectionExample {

    public String prueba2(){
        try {
            OkHttpClient client = getUnsafeOkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\"query\":\"query{\\r\\n  projects{\\r\\n    edges{\\r\\n      node{\\r\\n        id\\r\\n        name\\r\\n        priority\\r\\n        location{\\r\\n          name\\r\\n        }\\r\\n        properties{\\r\\n          id\\r\\n          stringValue\\r\\n        }\\r\\n        numberOfWorkOrders\\r\\n        createTime\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\",\"variables\":{}}");
            Request request = new Request.Builder()
                    .url("https://symphony.telefonica.com.mx/graph/query")
                    .method("POST", body)
                    .addHeader("Authorization", "Basic YWxvcGV6bGVAbnR0ZGF0YS5jb206U3ltcGgwbnkxMjM=")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Cookie", "connect.sid=s%3A2dOIWZWkSk7ZgNcubFebDoMwcGJFxYv_.PK%2BcCRh1ZltImKKZHxuFhUcBlkEoxQQj34Pz3YANhbo")
                    .build();
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body()).string();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public String alterWorOrder(){
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\"query\":\"mutation alterWorOrder($edit: EditProjectInput!){\\r\\n  editProject(input : $edit){\\r\\n      \\r\\n      id\\r\\n      name\\r\\n  }\\r\\n}\",\"variables\":{\"edit\":{\"type\":\"154618822664\",\"id\":\"146028888390\",\"name\":\"asdasd\"}}}");
            Request request = new Request.Builder()
                    .url("https://symphony.telefonica.com.mx/graph/query")
                    .method("POST", body)
                    .addHeader("Authorization", "Basic YWxvcGV6bGVAbnR0ZGF0YS5jb206U3ltcGgwbnkxMjM=")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Cookie", "connect.sid=s%3AHAWXR6ev9ga3_SBTJwlnlb0Cbp37M_tA.ebN9wHMhGzEm48yKTiE%2Bco2ixPmqV3oicvqcB5FMExA")
                    .build();
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body()).string();
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    /*
    public int insertJSONtoDB() throws Exception {
        int status = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
            PreparedStatement preparedStatement = con.prepareStatement("insert into  employee values ( ?, ?, ? )");
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("c.\\employee.json"));
            JSONObject jsonObject = (JSONObject) obj;

            String id = (String) jsonObject.get("id"); // from JSON tag
            preparedStatement.setString(1, id); // to the Database table

            String name = (String) itemize.get("name");
            preparedStatement.setString(2, name);

            String address = (String) itemize.get("address");
            preparedStatement.setString(3, address);

            status = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        return status;
    }*/

}