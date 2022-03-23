package com.example.Integracion_Siom.controller;

import com.example.Integracion_Siom.model.tmfxxx.WorkTicket;
import com.google.gson.Gson;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ExternalTaskSubscription("CheckProyectService")
public class ExecuteMicroService implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask extTask, ExternalTaskService extTaskService) {
        String workOrderJson = extTask.getVariable("workOrder").toString();
        WorkTicketController workTicketController = new WorkTicketController();
        WorkTicket workOrder = new Gson().fromJson(workOrderJson,WorkTicket.class);
        try{
            String IdUserAssigned= workOrder.getRelatedParty().get(1).getId();
            UserController userController = new UserController();
            String groupName = userController.getGroup(IdUserAssigned);

            if(groupName.equals("Proveedor SIOM")){
                workTicketController.SolicitaSIOM(workOrder);
            }
            VariableMap variables = Variables.createVariables();
            extTaskService.complete(extTask,variables);

            //Map<String, Object> variables = new HashMap<String, Object>();
            //variables.put("message", message);
            //variables.put("trial", true);
            //extTaskService.complete(extTask, variables);
        }catch (Exception e){
            VariableMap variables = Variables.createVariables();
            extTaskService.complete(extTask,variables);
        }

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