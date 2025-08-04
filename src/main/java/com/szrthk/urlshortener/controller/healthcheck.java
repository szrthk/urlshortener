package com.szrthk.urlshortener.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {
    public String healthCheck (){
        return ("System is working fine");
    }
}
