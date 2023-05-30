package com.codingspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    //How what route is our decorator go
    @GetMapping(value="/")
    public String index(){
        return "index";
    }
}
