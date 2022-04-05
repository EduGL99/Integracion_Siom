package com.example.Integracion_Siom.Controller;

import com.example.Integracion_Siom.exception.*;
import com.example.Integracion_Siom.model.tmfxxx.WorkTicket;

public class WorkTicketController {

    public void SolicitaSIOM(WorkTicket workTicket){
            RequestController requestController = new RequestController();
            //requestController.CrearRequest();
            requestController.request(workTicket);
    }
}
