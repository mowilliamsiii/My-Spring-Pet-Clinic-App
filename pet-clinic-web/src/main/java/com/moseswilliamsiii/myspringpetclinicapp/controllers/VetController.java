package com.moseswilliamsiii.myspringpetclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","vets/index"})
    public String listOfVets(){
        return "vets/index";
    }
}
