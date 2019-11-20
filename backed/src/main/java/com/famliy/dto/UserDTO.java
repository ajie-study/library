package com.famliy.dto;

import com.famliy.constant.Constant;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 
 * @author ajie
 * @Description 接受前端user数据
 * @date 2019-11-20 16:00
 *
 */
@Data
public class UserDTO {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户名
     */
    @NotBlank(message = Constant.USERNAME_ISNULL)
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = Constant.PASSWORD_ISNULL)
    private String password;
}
