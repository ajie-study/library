package com.family.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * 
 * @author ajie
 * @Description  配置Swagger
 * @date 2019-11-21 10:52
 *
 */

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //指定要生成api文档的根包
                .apis(RequestHandlerSelectors.basePackage("com.family.controller"))
                //路径配置
                .paths(regex("/.*"))
                .build()
                .apiInfo(apiInfo());

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Library 的 Restful API 文档")
                .description("Library 的 Restful API 文档")
                .version("1.0")
                .build();
    }
}
