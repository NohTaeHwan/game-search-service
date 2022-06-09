package com.toy.search.api.dto.result;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

/**
 * lol 계정 response 객체 - VO
 * 불변객체
 * hashcode , equals 재정의
 */
@Getter
@Builder(toBuilder = true)
public class LolAccountResult {

    private String id;
    private String accountId;
    private String puuid;
    private String name;
    private Integer profileIconId;
    private Long revisionDate;
    private Integer summonerLevel;

    @Override
    public int hashCode() {
        return Objects.hash(id,accountId,puuid,name,profileIconId,revisionDate,summonerLevel);
    }

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        final LolAccountResult lolAccountResult = (LolAccountResult) obj;

        return Objects.equals(id, lolAccountResult.id) &&
                Objects.equals(accountId, lolAccountResult.accountId) &&
                Objects.equals(puuid, lolAccountResult.puuid) &&
                Objects.equals(name, lolAccountResult.name) &&
                Objects.equals(profileIconId, lolAccountResult.profileIconId) &&
                Objects.equals(revisionDate, lolAccountResult.revisionDate) &&
                Objects.equals(summonerLevel, lolAccountResult.summonerLevel);
    }
}