package com.toy.search.api.config;

import com.toy.search.common.gamesearchcommon.config.BaseSwaggerConfig;
import com.toy.search.common.gamesearchcommon.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.toy.search.api.controller")
                .title("game search api")
                .description("game search api 문서")
                .contactName("toy")
                .version("1.0")
                //.enableSecurity(true)
                .build();
    }
}
