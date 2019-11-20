package com.famliy.model;

import lombok.Builder;
import lombok.Data;

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
}
