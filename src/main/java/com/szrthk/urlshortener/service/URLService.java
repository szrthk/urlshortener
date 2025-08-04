package com.szrthk.urlshortener.service;

import com.szrthk.urlshortener.entity.URLMapping;
import com.szrthk.urlshortener.repo.URLRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class URLService {

    @Autowired
    private URLRepositery urlRepositery;

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 6;

    private String generateShortCode() {
        Random random = new Random();
        StringBuilder shortCode = new StringBuilder();

        for (int i = 0; i < CODE_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            shortCode.append(CHARACTERS.charAt(index));
        }
        return shortCode.toString();
    }

    public URLMapping shortenURL(String longUrl) {
        String shortCode = generateShortCode();
        URLMapping urlMapping = new URLMapping();
        urlMapping.setLongUrl(longUrl);  // Corrected here
        urlMapping.setShortCode(shortCode);
        return urlRepositery.save(urlMapping);
    }

    public String getLongURL(String shortCode){
        URLMapping urlMapping = urlRepositery.findByShortCode(shortCode);
        if (urlMapping != null){
            return urlMapping.getLongUrl();  // Corrected here
        }
        return null;
    }
}