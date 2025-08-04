package com.szrthk.urlshortener.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity // marking it as db identity
@Data
public class URLMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // telling db automacitly generate unique value for this id.
    private Long id; // db will auto increment -  strategy = generation .identity

    @Column(nullable = false, unique = true) // this column cant be null, no repeat values
    private String shortCode;

    @Column(nullable = false)
    private String longUrl;
}
