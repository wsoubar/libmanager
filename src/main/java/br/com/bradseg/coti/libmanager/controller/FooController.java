package br.com.bradseg.coti.libmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bradseg.coti.libmanager.vo.Carro;

/**
 * FooController
 */
@RestController
@RequestMapping("/foos")
public class FooController {

    private static final String template = "Hello, %s!";

    @GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseStatus(HttpStatus.OK)
    public String hello(@PathVariable("id") String id) {
        return String.format(template, id);
    }

    @GetMapping(path="/carro/{nome}", produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public Carro getCarro(@PathVariable("nome") String nome) {
        Carro c = new Carro();
        c.setId(10L);
        c.setNome(nome);
        return c;
    }

}