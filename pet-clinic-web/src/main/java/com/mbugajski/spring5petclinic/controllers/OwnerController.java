package com.mbugajski.spring5petclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class OwnerController {

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listVets(){
        return "owners/index";
    }
}