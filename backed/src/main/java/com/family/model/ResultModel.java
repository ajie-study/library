package com.family.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

/**
 * 
 * @author ajie
 * @Description
 * @date 2019-11-20 15:58
 *
 */
@Data
@Builder
public class ResultModel {

    /**
     * 状态码
     */
    private String status;

    /**
     * 操作结果
     */
    private Object result;

    /**
     * 返回信息
     */
    private String message;

    @Tolerate
    public ResultModel(){

    }
}
