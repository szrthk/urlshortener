package com.szrthk.urlshortener.repo;

import com.szrthk.urlshortener.entity.URLMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // we are using jpa repo because we are working with Relational databases
public interface URLRepositery extends JpaRepository<URLMapping, Long> {
    URLMapping findByShortCode(String shortCode);// to search which long url it is referring to
}
