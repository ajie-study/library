package com.family.service.impl;

import com.family.dto.UserDTO;
import com.family.model.ResultModel;
import com.family.model.User;
import com.family.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author ajie
 * @Description
 * @date 2019-11-22 11:23
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void login() {

        UserDTO userDTO = new UserDTO();

        userDTO.setUsername("admin");

        userDTO.setPassword("YWRtaW4=");

        ResultModel login = userService.login(userDTO);

        System.out.println(login);

    }
}