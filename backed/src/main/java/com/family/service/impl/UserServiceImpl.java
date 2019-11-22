package com.family.service.impl;

import com.family.constant.CodeEnum;
import com.family.constant.Constant;
import com.family.dto.UserDTO;
import com.family.mapper.UserMapper;
import com.family.model.ResultModel;
import com.family.model.User;
import com.family.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * 
 * @author ajie
 * @Description 
 * @date 2019-11-20 17:01
 *
 */

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultModel login(UserDTO userDTO) {

        //1、获取用户信息
        User user = userMapper.findByUsername(userDTO.getUsername());

        ResultModel resultModel = ResultModel.builder().build();

        if(user == null){
            //2、用户不存在
            resultModel.setStatus(CodeEnum.user_not_exist.getCode());
            resultModel.setMessage(CodeEnum.user_not_exist.getMessage());
            return resultModel;
        }

        if(!user.getPassword().equals(userDTO.getPassword())){
            //3、账号密码错误
            resultModel.setStatus(CodeEnum.user_password_error.getCode());
            resultModel.setMessage(CodeEnum.user_password_error.getMessage());
            log.info("用户名{}登录密码错误！", userDTO.getUsername());
            return resultModel;

        }

        //4、正确，正常返回
        resultModel.setStatus(Constant.SUCCESS);
        resultModel.setMessage(Constant.LOGIN_SUCCESS);

        return resultModel;
    }
}
