package com.example.Integracion_Siom.controller;

import com.example.Integracion_Siom.Models.Project;
import com.example.Integracion_Siom.Models.Request;
import com.example.Integracion_Siom.Models.WorkOrder;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ExternalTaskSubscription("CheckProyectService")
public class ProjectController {

    public boolean EsExterno(Project project){
        if(project.getType().equals("Externo"))
            return true;
        return false;
    }

    public void SolicitaSIOM(Project project){
        if(!EsExterno(project)){
            RequestController requestController = new RequestController();
            requestController.CrearRequest();
            requestController.request();
        }else{
            //nada
        }
    }
}
