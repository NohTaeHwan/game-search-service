package com.toy.search.api.dto.result;

import lombok.Builder;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

/**
 * lol 매치 response 객체 - VO
 * 불변객체
 * hashcode , equals 재정의
 */
@Getter
@Builder(toBuilder = true)
public class LolMatchResult {

    //// info 매핑
    private Long gameEndTimestamp;
    private Integer gameDuration;
    private Integer gameId;
    private String gameMode;
    private Long gameStartTimestamp;
    private String gameType;
    private Integer mapId;

    private MatchParticipant [] matchParticipants;

    @Override
    public int hashCode() {
        return Objects.hash(gameEndTimestamp,gameDuration,gameId,
                gameMode,gameStartTimestamp,gameType,mapId,
                Arrays.hashCode(matchParticipants));
    }

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        final LolMatchResult lolMatchResult = (LolMatchResult) obj;

        return Objects.equals(gameEndTimestamp, lolMatchResult.gameEndTimestamp) && Objects.equals(gameDuration, lolMatchResult.gameDuration) &&
                Objects.equals(gameId, lolMatchResult.gameId) && Objects.equals(gameMode, lolMatchResult.gameMode) &&
                Objects.equals(gameStartTimestamp, lolMatchResult.gameStartTimestamp) && Objects.equals(gameType, lolMatchResult.gameType) &&
                Objects.equals(mapId, lolMatchResult.mapId) &&
                matchParticipants == lolMatchResult.matchParticipants;
    }
}
