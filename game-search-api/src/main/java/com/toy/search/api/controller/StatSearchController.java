package com.toy.search.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@RestController
@RequestMapping("/api/stat")
public class StatSearchController {

    @Value("${open-api.riot.api-key}")
    private String API_KEY;

    @GetMapping("")
    public Map<String,Object> getStatData(){

        WebClient webClient = WebClient.create();




        return null;
    }

}
