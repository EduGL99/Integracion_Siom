package com.example.Integracion_Siom.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Request {
    int cont_id;
    int empl_id;
    int empr_id;
    List formularios;
    List id_acompanante;
    int id_despachador;
    int id_jcuadrilla;
    String orse_descripcion;
    String orse_fecha_creacion;
    String orse_fecha_solicitud;
    String orse_indisponibilidad;
    String orse_tag;
    String orse_tipo;
    int sube_id;
    String usua_login_creador;
    String usua_pass_creador;

    public Request() {
    }
}
