package com.example.atividade_n2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ClimaController {

    @Autowired
    private ClimaService climaService;

    @GetMapping("/clima")
    public ResponseEntity<?> getClima(@RequestParam String cidade) {
        return climaService.obterClima(cidade);}

    @PostMapping("/processo")
    public ResponseEntity<?> processaDados(@RequestBody String dados) {
        return climaService.processarDados(dados);}

    @GetMapping("/sobre")
    public ResponseEntity<?> sobre() {
        return ResponseEntity.ok(
                "{\"estudante\": \"Geovane Vieira de Souza\", \"projeto\": \"atividade_n2_Serviço de Meteorologia\"}");}
}