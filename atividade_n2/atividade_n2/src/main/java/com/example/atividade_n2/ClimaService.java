package com.example.atividade_n2;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaService {

    private final String API_KEY = "coloque_sua_api_key";

    public ResponseEntity<?> obterClima(String cidade) {

        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + cidade + "&appid=" + API_KEY + "&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        try {
            String response = restTemplate.getForObject(url, String.class);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao consultar o clima.");}

    }

    public ResponseEntity<?> processarDados(String dados) {

        return ResponseEntity.ok("Dados processados: " + dados);}
}
