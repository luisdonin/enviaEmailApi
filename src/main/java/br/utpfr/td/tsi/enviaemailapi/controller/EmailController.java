package br.utpfr.td.tsi.enviaemailapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/enviaemail")
@CrossOrigin(origins = "*")
public class EmailController {
    @PostMapping("/confirmacao")
    public ResponseEntity<Map<String, String>> enviarConfirmacao(@RequestBody Email email){
        System.out.println("email de confirmação");
        System.out.println("nome: " + email.getNome());
        System.out.println("para: " + email.getEmail());

        return ResponseEntity.ok(Map.of("status", "email confirmação de compra enviado"));
    }

    @PostMapping("/transacao")
    public ResponseEntity<Map<String, String>> enviarConfirmacaoTransacao(@RequestBody Email email){
        System.out.println("email de confirmação de transação");
        System.out.println("nome: " + email.getNome());
        System.out.println("para: " + email.getEmail());

        return ResponseEntity.ok(Map.of("status", "email de confirmação de transação enviado"));
    }


    @PostMapping("/envianf")
    public ResponseEntity<Map<String, String>> enviarNF(@RequestBody Email email){
        System.out.println("NFe enviadao");
        System.out.println("nome: " + email.getNome());
        System.out.println("para: " + email.getEmail());

        return ResponseEntity.ok(Map.of("status", "NFe enviada"));
    }

    @PostMapping("/dadosentrega")
    public ResponseEntity<Map<String, String>> enviarDadosEntrega(@RequestBody Email email){
        System.out.println("NFe enviadao");
        System.out.println("Destinatário: " + email.getNome());
        System.out.println("email: " + email.getEmail());
        System.out.println("logradouro: " + email.getLogradouro());
        System.out.println("bairro: " + email.getBairro());
        System.out.println("cep: " + email.getCep());
        System.out.println("Cidade: " + email.getCidade());
        System.out.println("Uf: " + email.getUf());


        return ResponseEntity.ok(Map.of("status", "NFe enviada"));
    }
}
