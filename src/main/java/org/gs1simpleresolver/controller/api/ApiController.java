package org.gs1simpleresolver.controller.api;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import jakarta.servlet.http.HttpServletRequest;

import java.net.URI;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class ApiController {

	
	@GetMapping("/api/**")
    public ResponseEntity<String> handleApiPaths(HttpServletRequest request) {
        // Obtém o caminho dentro do mapeamento. Ex.: "/api/algo"
        String path = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        System.out.println("Requisição API recebida: " + path);
        
        // Implemente aqui a lógica para as URLs /api/*
        // Por exemplo, redirecionar, processar dados ou retornar um JSON
        return ResponseEntity.ok("Endpoint API processado: " + path);
    }
	
}
