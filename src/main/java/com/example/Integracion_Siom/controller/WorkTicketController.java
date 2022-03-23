package com.example.Integracion_Siom.controller;

import com.example.Integracion_Siom.Models.Project;
import com.example.Integracion_Siom.model.tmfxxx.WorkTicket;
import com.example.Integracion_Siom.service.impl.WorkTicketService;
import com.example.Integracion_Siom.exception.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public class WorkTicketController {

    public void SolicitaSIOM(WorkTicket workTicket){
            RequestController requestController = new RequestController();
            requestController.CrearRequest();
            requestController.request();
    }
}
