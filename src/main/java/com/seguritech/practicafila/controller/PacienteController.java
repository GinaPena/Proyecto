package com.seguritech.practicafila.controller;


import com.seguritech.practicafila.domain.Paciente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {
    @RequestMapping(value = "/paciente")
    public Paciente findOne(){
        Paciente paciente = new Paciente();
        paciente.setId(1L);
        return paciente;
    }


}
