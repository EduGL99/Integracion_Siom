package com.example.Integracion_Siom.controller;

import com.example.Integracion_Siom.Models.User;
import com.google.gson.Gson;
import okhttp3.*;

import java.util.Objects;

import static com.example.Integracion_Siom.Models.GetUnsafeOkHttpClient.getUnsafeOkHttpClient;

public class UserController extends User{

    public String getGroup(String idUser){
        try {
            OkHttpClient client = getUnsafeOkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\"query\":\"query DataUser($datauser: ID!) { \\r\\n  user: node(id: $datauser) { \\r\\n    id \\r\\n    ...datauser\\r\\n  } \\r\\n}\\r\\n\\r\\nfragment datauser on User{\\r\\n\\tgroups{\\r\\n    id\\r\\n    name\\r\\n    status\\r\\n  }\\r\\n}\",\"variables\":{\"datauser\":\""+idUser+"\"}}");
            Request request = new Request.Builder()
                    .url("https://symphony.telefonica.com.mx/graph/query")
                    .method("POST", body)
                    .addHeader("Authorization", "Basic YWxvcGV6bGVAbnR0ZGF0YS5jb206U3ltcGgwbnkxMjM=")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Cookie", "connect.sid=s%3AbqEXeoz28_0m37rMvOcmfdAu38I-uTu8.FYdtEzRQdELfOIw%2BEiwul%2FpynPlA19w8x8CDDqFXtaA")
                    .build();
            Response response = client.newCall(request).execute();
            String mJsonString = Objects.requireNonNull(response.body()).string();
            mJsonString = mJsonString.replace("{\"data\":{\"user\":","");
            mJsonString = mJsonString.replace("}}}","}");
            User group = new Gson().fromJson(mJsonString,User.class);
            return group.getGroups().get(0).getName();
        }catch (Exception e){
            return e.toString();
        }
    }
}
