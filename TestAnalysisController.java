package com.proyecto.pulmoscan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class TestAnalysisController {

    @GetMapping("/pulmoscan/analyze-test")
    public String testAnalysis() {
        System.out.println("Entrando al análisis de prueba... " + Instant.now());
        return "Resultado simulado: No se detectan anomalías. Probabilidad de cáncer: 2.3%";
    }
}
