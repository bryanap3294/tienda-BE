package com.jordan.tienda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prueba")
public class PruebaController {

    @GetMapping("/holamundo")
    public String holaMundo(){
        return "Hello World";
    }

}
