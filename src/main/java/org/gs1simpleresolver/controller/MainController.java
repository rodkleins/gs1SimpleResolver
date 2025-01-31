package org.gs1simpleresolver.controller;

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
public class MainController {
	
	@GetMapping("/**")
	public ResponseEntity<Void> handleDynamicPath(HttpServletRequest request) {
        // Obtém o caminho completo da requisição. Exemplo: "/01/88383838/1/abc123"
        String fullPath = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        
        // Exibe o caminho completo (pode ser logado ou processado conforme necessário)
        System.out.println("Caminho recebido: " + fullPath);

        // Desmembra o caminho em partes, removendo a barra inicial, se houver
        // O método split("/") gera um array onde cada elemento é um segmento do caminho
        String[] segments = fullPath.replaceFirst("^/", "").split("/");

        // Exibe os segmentos para fins de depuração
        for (int i = 0; i < segments.length; i++) {
            System.out.println("Segmento " + i + ": " + segments[i]);
        }

        // Aqui você pode implementar a lógica necessária com base nos segmentos capturados.
        // Por exemplo, redirecionar para uma URL com base em um ou mais desses segmentos.
        // Neste exemplo, vamos redirecionar para "https://www.example.com" apenas como demonstração.
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("https://www.example.com"));

        // Retorna uma resposta com código de status 302 (Found)
        return new ResponseEntity<>(headers, HttpStatus.FOUND);
    }
}
