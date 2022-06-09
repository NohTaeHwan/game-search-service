package com.toy.search.api.dto.result;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

/**
 * lol 티어 response 객체 - VO
 * 불변객체
 * hashcode , equals 재정의
 */
@Getter
@Builder(toBuilder = true)
public class LolLeagueResult {

    private String leagueId;
    private String queueType;
    private String tier;
    private String rank;
    private String summonerId;
    private String summonerName;
    private Integer leaguePoints;
    private Integer wins;
    private Integer losses;
    private Boolean veteran;
    private Boolean inactive;
    private Boolean freshBlood;
    private Boolean hotStreak;

    @Override
    public int hashCode() {
        return Objects.hash(leagueId, queueType, tier, rank, summonerId, summonerName, leaguePoints,
                wins, losses, veteran, inactive, freshBlood, hotStreak);
    }

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        final LolLeagueResult lolLeagueResult = (LolLeagueResult) obj;

        return Objects.equals(leagueId, lolLeagueResult.leagueId) && Objects.equals(queueType, lolLeagueResult.queueType) &&
                Objects.equals(tier, lolLeagueResult.tier) && Objects.equals(rank, lolLeagueResult.rank) &&
                Objects.equals(summonerId, lolLeagueResult.summonerId) && Objects.equals(summonerName, lolLeagueResult.summonerName) &&
                Objects.equals(leaguePoints, lolLeagueResult.leaguePoints) && Objects.equals(wins, lolLeagueResult.wins) &&
                Objects.equals(losses, lolLeagueResult.losses) && veteran == lolLeagueResult.veteran &&
                inactive == lolLeagueResult.inactive && freshBlood == lolLeagueResult.freshBlood && hotStreak == lolLeagueResult.hotStreak;
    }
}
