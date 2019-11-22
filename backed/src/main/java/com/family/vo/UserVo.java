package com.family.vo;

import lombok.Data;

/**
 * 
 * @author ajie
 * @Description  用户视图model
 * @date 2019-11-20 15:56
 *
 */
@Data
public class UserVo {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
