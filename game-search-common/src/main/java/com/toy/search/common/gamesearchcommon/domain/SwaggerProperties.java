package com.toy.search.common.gamesearchcommon.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class SwaggerProperties {
    /**
     * API 문서 생성 기본 경로
     */
    private String apiBasePackage;
    /**
     * 로그인 인증을 사용할 지 여부
     */
    private boolean enableSecurity;
    /**
     * 문서제목
     */
    private String title;
    /**
     * 문서설명
     */
    private String description;
    /**
     * 문서버전
     */
    private String version;
    /**
     * 문서연락처명
     */
    private String contactName;
    /**
     * 문서연락처 URL
     */
    private String contactUrl;
    /**
     * 문서연락처 email
     */
    private String contactEmail;
}
