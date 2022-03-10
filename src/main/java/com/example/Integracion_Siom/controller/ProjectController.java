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
    List<WorkOrder> workOrders = new ArrayList<>();

    public Project CrearProject(){
        workOrders.add(new WorkOrder("123548798450","EN PROGRESO","123456789461"));
        workOrders.add(new WorkOrder("321","EN PROGRESO","123456789461"));
        Project project = new Project();
        project.setId("12365478945");
        project.setName("Prueba");
        project.setDescription("Descripción de prueba");
        project.setCreatedBy("Don creación");
        project.setCreateTime("03-03-2022 10:12:31");
        project.setType("78945612646");
        project.setTemplate("45678513546");
        project.setLocation("La presa");
        project.setWorkOrders(workOrders);
        project.setNumberOfWorkOrders("8");
        project.setProperties("asdasd");
        project.setComments("Comentarios");
        return project;
    }

    public boolean EsExterno(Project project){
        if(project.getType().equals("Externo"))
            return true;
        //if(project.getWorkOrders().get(0).getState().equals("EN PROGRESO"))
          //  return true;
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
