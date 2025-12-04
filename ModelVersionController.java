package com.proyecto.pulmoscan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class ModelVersionController {

    @GetMapping("/pulmoscan/model-version")
    public String modelVersion() {
        System.out.println("Consultando versión del modelo IA... " + Instant.now());
        return "Versión actual del modelo IA: PulmoScan-Net v1.3";
    }
}
