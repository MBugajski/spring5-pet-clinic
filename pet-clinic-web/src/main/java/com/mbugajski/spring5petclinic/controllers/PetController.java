package com.mbugajski.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pets")
@Controller
public class PetController {

    // Have to use empty string if mapping directory in the class, apparently
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(){
        return "pets/index";
    }
}
