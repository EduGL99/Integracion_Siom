package com.example.Integracion_Siom.controller;

import com.example.Integracion_Siom.Models.JsonProject.object;
import com.example.Integracion_Siom.Models.Project;
import com.example.Integracion_Siom.exception.BadRequestException;
import com.example.Integracion_Siom.model.tmfxxx.WorkTicket;
import com.example.Integracion_Siom.service.impl.SymphonyUserService;
import com.example.Integracion_Siom.service.impl.SymphonyWorkOrderService;
import com.example.Integracion_Siom.service.impl.WorkTicketService;
import com.example.Integracion_Siom.symphony.WorkOrderTypeGraphToTMFxxx;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Component
@ExternalTaskSubscription("CheckProyectService")
public class ExecuteMicroService implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask extTask, ExternalTaskService extTaskService) {
        SymphonyWorkOrderService workTicketService = new SymphonyWorkOrderService();

        SymphonyUserService w = new SymphonyUserService();
        try {
            workTicketService.get("223338318668");
            w.getUser("214748364805");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Gson g = new Gson();
        String workOrderJson = extTask.getVariable("workOrder").toString();
        WorkTicket workTicket = g.fromJson(workOrderJson,WorkTicket.class);

        System.out.println(workTicket);
        //if(workTicket.getRelatedParty().get(1).get)
        VariableMap variables = Variables.createVariables();

        extTaskService.complete(extTask,variables);
    }

    /*
    @Override
    public void execute(ExternalTask extTask, ExternalTaskService extTaskService) {
        Gson g = new Gson();
        String json = extTask.getVariable("workOrder").toString();
        data = new Gson().fromJson(json, object.class);
        WorkOrderTypeGraphToTMFxxx workOrder = new WorkOrderTypeGraphToTMFxxx();
        WorkTicket workTicket = g.fromJson(json,WorkTicket.class);
        System.out.println(workOrder);
        // Show it.
        System.out.println(data);
        g.toJson(newProject);
        Project p = g.fromJson(json,Project.class);
        System.out.println(p.getId());

        newProject.setId(data.getId());
        newProject.setName(data.getName());
        newProject.setDescription("descripcion");
        newProject.setCreatedBy(data.getCharacteristic()[0].getName());
        newProject.setCreateTime(data.getCreationDate());
        newProject.setType(data.getType());
        newProject.setTemplate("template");
        newProject.setLocation("location");
        //newProject.setWorkOrders(workOrders);
        newProject.setNumberOfWorkOrders(extTask.getVariable("numberofworkorders").toString());
        newProject.setProperties(extTask.getVariable("properties"));
        newProject.setComments(extTask.getVariable("comments"));

        newProjectController.SolicitaSIOM(newProject);


        VariableMap variables = Variables.createVariables();

        extTaskService.complete(extTask,variables);
    }
    */
}