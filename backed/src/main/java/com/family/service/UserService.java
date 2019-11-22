package com.family.service;

import com.family.dto.UserDTO;
import com.family.model.ResultModel;

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
    ResultModel login(UserDTO userDTO);
}
