package com.clase8.ejercicio4.controlador;

import com.clase8.ejercicio4.servicio.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class PasswordController {

    PasswordGenerator passwordGenerator;

    @Autowired
    public PasswordController(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }
    @GetMapping("/generate-password/{nombre}")
    public String obtenerContra(@PathVariable String nombre) {
        return passwordGenerator.generarContra(nombre);
    }
}
