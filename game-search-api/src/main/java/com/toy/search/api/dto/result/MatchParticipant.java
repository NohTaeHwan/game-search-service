package com.toy.search.api.dto.result;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

/**
 * lol 매치 참여자 response 객체 - VO
 * 불변객체
 * hashcode , equals 재정의
 */

@Getter
@Builder(toBuilder = true)
public class MatchParticipant {

    private Integer assist;

    private Integer champLevel;
    private Integer championId;
    private String championName;
    private Integer deaths;

    private Integer goldEarned;
    private Integer item0;
    private Integer item1;
    private Integer item2;
    private Integer item3;
    private Integer item4;
    private Integer item5;
    private Integer item6;
    private Integer kills;
    private Integer neutralMinionsKilled;
    private Integer totalMinionsKilled;

    private Integer summoner1Id;//소환사 스펠1
    private Integer summoner2Id;//소환사 스펠2

    private String summonerName;
    private Integer totalDamageDealtToChampions;

    private Integer visionScore;
    private Integer visionWardsBoughtInGame;
    private Integer wardsKilled;
    private Integer wardsPlaced;
    private Boolean win;


    //// challenges 매핑
    private Double kda;
    private Double killParticipation;

    //// perks 매핑
    ///// perks -> styles[0] -> selections[0] -> perk
    private Integer perk;//첫번째 메인룬 id
    ///// perks -> styles[1] -> style
    private Integer style;//보조룬 스타일 id

    @Override
    public int hashCode() {
        return Objects.hash(assist, champLevel, championId, championName, deaths, goldEarned,
                item0, item1, item2, item3, item4, item5, item6, kills, neutralMinionsKilled,
                totalMinionsKilled, summoner1Id, summoner2Id, summonerName, totalDamageDealtToChampions,
                visionScore, visionWardsBoughtInGame, wardsKilled, wardsPlaced, win, kda,
                killParticipation, perk, style);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        final MatchParticipant matchParticipant = (MatchParticipant) obj;

        return Objects.equals(assist, matchParticipant.assist) && Objects.equals(champLevel, matchParticipant.champLevel) && Objects.equals(championId, matchParticipant.championId) && Objects.equals(championName, matchParticipant.championName) &&
                Objects.equals(deaths, matchParticipant.deaths) && Objects.equals(goldEarned, matchParticipant.goldEarned) && Objects.equals(item0, matchParticipant.item0) && Objects.equals(item1, matchParticipant.item1) &&
                Objects.equals(item2, matchParticipant.item2) && Objects.equals(item3, matchParticipant.item3) && Objects.equals(item4, matchParticipant.item4) && Objects.equals(item5, matchParticipant.item5) &&
                Objects.equals(item6, matchParticipant.item6) && Objects.equals(kills, matchParticipant.kills) && Objects.equals(neutralMinionsKilled, matchParticipant.neutralMinionsKilled) &&
                totalMinionsKilled== matchParticipant.totalMinionsKilled&& summoner1Id== matchParticipant.summoner1Id&& summoner2Id== matchParticipant.summoner2Id&&
                summonerName== matchParticipant.summonerName&& totalDamageDealtToChampions== matchParticipant.totalDamageDealtToChampions&&
                visionScore== matchParticipant.visionScore&& visionWardsBoughtInGame== matchParticipant.visionWardsBoughtInGame&& wardsKilled== matchParticipant.wardsKilled&&
                wardsPlaced== matchParticipant.wardsPlaced&& win== matchParticipant.win&& kda== matchParticipant.kda&&
                killParticipation== matchParticipant.killParticipation&& perk== matchParticipant.perk&& style== matchParticipant.style;
    }
}
