package com.example.api_rest_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/info")
    public String info() {
        return "Esta é uma API pública. Todos podem acessar!";
    }
}