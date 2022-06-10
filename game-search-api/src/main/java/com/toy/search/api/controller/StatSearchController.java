package com.toy.search.api.controller;

import com.toy.search.api.service.StatSearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/stat")
@Api(tags = "StatSearchController")
@RequiredArgsConstructor
public class StatSearchController {

    private final StatSearchService statSearchService;

    @GetMapping("")
    @ApiOperation(value="소환사 정보 및 매치 정보 조회")
    public Map<String,Object> getStatData(String summonerName){

        //TODO global Exception handler로 처리
        try {
            statSearchService.getSummonerPuuid(summonerName);
        }catch (Exception e){
            System.out.println("getSummonerPuuid error catch");
        }


        return null;
    }

}
