package com.family.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ajie
 * @Description 公共控制台
 * @date 2019-11-22 15:30
 *
 */
@Api(value = "公共api", description = "公共接口，不涉及到具体的资源")
@RestController
@Slf4j
@RequestMapping()
public class CommonController {

    @GetMapping("/v1/library/common/health")
    @ApiOperation("健康检查接口")
    public ResponseEntity<Void> health(){

        log.info("请求健康检查接口");

        return ResponseEntity.ok().body(null);
    }

}
