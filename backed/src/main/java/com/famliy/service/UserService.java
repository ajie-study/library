package com.famliy.service;

import com.famliy.dto.UserDTO;
import com.famliy.model.ResultModel;

import javax.validation.Valid; /**
 * 
 * @author ajie
 * @Description 
 * @date 2019-11-20 17:00
 *
 */

public interface UserService {

    /**
     * 用户登录
     * @param userDTO
     * @return
     */
    ResultModel login(@Valid UserDTO userDTO);
}
