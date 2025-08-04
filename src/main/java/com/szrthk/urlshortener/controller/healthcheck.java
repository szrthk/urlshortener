package com.szrthk.urlshortener.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheck {
    public String healthCheck (){
        return ("URL Shortener is working fine");
    }
}
