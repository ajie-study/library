package com.family.controller;

import com.family.dto.UserDTO;
import com.family.model.ResultModel;
import com.family.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 
 * @author ajie
 * @Description 登录
 * @date 2019-11-20 16:02
 *
 */
@RestController
@CrossOrigin //解决跨域问题
@RequestMapping("/v1/library/user")
public class LoginController {

    @Autowired
    private UserService userServiceImpl;

    @PostMapping("/login")
    public ResponseEntity<ResultModel> login(@RequestBody @Valid UserDTO userDTO){

        ResultModel resultModel = userServiceImpl.login(userDTO);

        return ResponseEntity.ok(resultModel);
    }

}
