package com.example.api_rest_spring_boot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping(path = "/hello",
            produces=
            MediaType.APPLICATION_JSON_VALUE)
    public String helloResponse() {
        return "{\"message\":"
                + "\"Hello, World!"
                + "From Spring Boot\"}";
    }
}
