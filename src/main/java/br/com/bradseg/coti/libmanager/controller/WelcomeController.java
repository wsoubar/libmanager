package br.com.bradseg.coti.libmanager.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * WelcomeController
 */
@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String index(Model model) {
        logger.debug("Iniciando client-jar-lib-manager...");
        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        return "index";
    }

    private String getMessage() {
        return "Hello World";
    }
    
}