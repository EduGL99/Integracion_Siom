package com.example.Integracion_Siom.controller;

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

@RestController
@RequestMapping("/tmf-api/workTicketManagement/v1")
//@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST,
//        RequestMethod.PATCH})
public class WorkTicketController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkTicketController.class);

    @Autowired
    WorkTicketService workTicketService;

    private final ObjectMapper json = new ObjectMapper();

    @GetMapping("/workTicket")
    public List<WorkTicket> listWorkTicket(@RequestParam Map<String, String> params) throws BadRequestException {
        return workTicketService.listWorkTicket(params);
    }

    @GetMapping("/workTicket/{id}")
    public WorkTicket getWorkTicket(@PathVariable String id, @RequestParam Map<String, String> params)
            throws BadRequestException, InternalErrorException, NotFoundException {
        return workTicketService.getWorkTicket(id, params);
    }

    @PostMapping("/workTicket")
    public WorkTicket createWorkTicket(@RequestBody WorkTicket request) throws BadRequestException,
            UnprocessableEntityException {
        try {
            LOGGER.debug("*** The request for create Work Ticket is: " + json.writeValueAsString(request));
        } catch (JsonProcessingException e) {
            LOGGER.info("*** Error on create Work Ticket. Cause: " + e.getCause() + " -- Message: " + e.getMessage());
            throw new BadRequestException();
        }
        return workTicketService.createWorkTicket(request);
    }

    @PatchMapping("/workTicket/{id}")
    public WorkTicket updateWorkTicket(@PathVariable String id, @RequestParam Map<String, String> params,
                                       @RequestBody WorkTicket request) {
        try {
            LOGGER.debug("*** The request for update Work Ticket is: " + json.writeValueAsString(request));
        } catch (JsonProcessingException e) {
            LOGGER.info("*** Error on update Work Ticket => Cause: " + e.getCause() + " -- Message: " + e.getMessage());
            throw new BadRequestException();
        }
        return workTicketService.updateWorkTicket(id, params, request);
    }

    @DeleteMapping("/workTicket/{id}")
    public void deleteWorkTicket(@PathVariable String id, @RequestParam Map<String, String> params) {
        throw new MethodNotAllowedException();
    }
}
