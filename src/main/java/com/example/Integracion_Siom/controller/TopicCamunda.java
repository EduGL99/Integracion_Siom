package com.example.Integracion_Siom.controller;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("CheckProyectService")
public class TopicCamunda implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask extTask, ExternalTaskService extTaskService){


        VariableMap variables = Variables.createVariables();

        extTaskService.complete(extTask,variables);
    }
}
