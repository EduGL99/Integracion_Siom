package com.example.Integracion_Siom.controller;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;


@ExternalTaskSubscription("pruebax")
public class PruebaCamunda implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        String name = externalTask.getVariable("name");

        VariableMap variables = Variables.createVariables();
        Logger.getLogger("scoreProvider")
                .log(Level.INFO, "Credit score {0} for customer {1} provided!", new Object[]{123, 123});
        externalTaskService.complete(externalTask,variables);
    }
}
