package com.szrthk.urlshortener.controller;

import com.szrthk.urlshortener.entity.URLMapping;
import com.szrthk.urlshortener.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class URLController {
    @Autowired
    private URLService urlService;

    @PostMapping(value = "/shorten", consumes = "text/plain")
    public URLMapping shortenURL(@RequestBody String longUrl){
        return urlService.shortenURL(longUrl);
    }
    @GetMapping("/{shortcode}")
    public String getlongurl(@PathVariable String shortcode){
        String longURL = urlService.getLongURL(shortcode);
        if (longURL != null) {
            return longURL;
        } else {
            return "Short URL not found.";
        }
    }
}
