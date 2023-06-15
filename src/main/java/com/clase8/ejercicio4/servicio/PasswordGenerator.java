package com.clase8.ejercicio4.servicio;

import org.springframework.stereotype.Service;

@Service
public class PasswordGenerator {

    public String generarContra(String nombre) {
        long random = (long) (Math.random() * 100000000);

        return nombre + random;
    }
}
