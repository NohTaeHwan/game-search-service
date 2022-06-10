package com.toy.search.api.service.impl;

import com.toy.search.api.service.StatSearchService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StatSearchServiceImpl implements StatSearchService {


    @Value("${open-api.riot.api-key}")
    private String API_KEY;


    /// summoner조회 -> match id 조회 --> match id로 매치 데이터 조회(비동기로 되야할수도 async)
    // /lol/match/v5/matches/by-puuid/{puuid}/ids
    // /lol/match/v5/matches/{matchId}
    ///// 소환사 정보 조회(puuid 가져오기)
    public String getSummonerPuuid(String summonerName) throws Exception {

        WebClient webClient = WebClient.builder()
                .baseUrl("https://kr.api.riotgames.com/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        String response = webClient.get()
                .uri("/lol/summoner/v4/summoners/by-name/" + summonerName + "?api_key=" + API_KEY)
                .retrieve().bodyToMono(String.class).block();

        System.out.println("response : " + response);

        JSONParser jsonParser = new JSONParser();

        Object obj = jsonParser.parse(response);
        JSONObject jsonObject = (JSONObject) obj;

        String puuid = (String) jsonObject.get("puuid");

        System.out.println("puuid : " + puuid);

        return "";
    }

}
