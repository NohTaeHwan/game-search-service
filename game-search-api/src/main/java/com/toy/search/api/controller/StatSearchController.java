package com.toy.search.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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

    /// summoner조회 -> match id 조회 --> match id로 매치 데이터 조회(비동기로 되야할수도 async)

    // /lol/match/v5/matches/by-puuid/{puuid}/ids
    // /lol/match/v5/matches/{matchId}
    @GetMapping("")
    public Map<String,Object> getStatData(String summonerName){

        WebClient webClient = WebClient.builder()
                .baseUrl("https://kr.api.riotgames.com/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        // TODO 테스트용
        summonerName = "꼼쭈꼼쭈";

        String response = webClient.get()
                .uri("/lol/summoner/v4/summoners/by-name/" + summonerName + "?api_key="+API_KEY)
                .retrieve().bodyToMono(String.class).block();




        return null;
    }

}
