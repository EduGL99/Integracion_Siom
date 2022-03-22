package com.example.Integracion_Siom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Registro no encontrado.")
public class NotFoundException extends RuntimeException {
}
