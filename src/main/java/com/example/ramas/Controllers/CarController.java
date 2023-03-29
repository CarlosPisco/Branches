package com.example.ramas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class CarController {


    @GetMapping("/index")
    public String vistaPrincipal(){
        return "cars";
    }


    @GetMapping("/vista2")
    public String otravista(){
        return "vista2";
    }
}
