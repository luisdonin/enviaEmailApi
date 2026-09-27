package br.utpfr.td.tsi.enviaemailapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("g/enviaemail")
@CrossOrigin(origins = "*")
public class EmailController {
    @PostMapping("/confirmacao")
    public ResponseEntity<Map<String, String>> enviarConfirmacao(@RequestBody Email email){
        System.out.println("email de confirmação");
        System.out.println("nome" + email.getNome());
        System.out.println("para" + email.getEmail());

        return ResponseEntity.ok(Map.of("status", "email enviado"));
    }
}
