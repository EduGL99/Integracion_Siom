package com.example.Integracion_Siom.controller;



import com.example.Integracion_Siom.Models.Project;
import com.example.Integracion_Siom.Models.WorkOrder;
import okhttp3.*;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static com.example.Integracion_Siom.Models.GetUnsafeOkHttpClient.getUnsafeOkHttpClient;


@Component
@ExternalTaskSubscription("CheckProyectService")
public class ExecuteMicroService implements ExternalTaskHandler {
    ProjectController newProjectController = new ProjectController();
    Project newProject = new Project();
    @Override
    public void execute(ExternalTask extTask, ExternalTaskService extTaskService) {

        newProject.setId(extTask.getVariable("idproject"));
        newProject.setName(extTask.getVariable("name"));
        newProject.setDescription(extTask.getVariable("description"));
        newProject.setCreatedBy(extTask.getVariable("createby"));
        newProject.setCreateTime(extTask.getVariable("createtime"));
        newProject.setType(extTask.getVariable("type"));
        newProject.setTemplate(extTask.getVariable("template"));
        newProject.setLocation(extTask.getVariable("location"));
        //newProject.setWorkOrders(workOrders);
        newProject.setNumberOfWorkOrders(extTask.getVariable("numberofworkorders").toString());
        newProject.setProperties(extTask.getVariable("properties"));
        newProject.setComments(extTask.getVariable("comments"));

        newProjectController.SolicitaSIOM(newProject);


        VariableMap variables = Variables.createVariables();

        extTaskService.complete(extTask,variables);
    }

}