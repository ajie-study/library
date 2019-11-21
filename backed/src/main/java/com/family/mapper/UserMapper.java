package com.family.mapper;

import com.family.constant.Constant;
import com.family.model.User;
import org.apache.ibatis.annotations.Param;

import javax.validation.constraints.NotBlank;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User findByUsername(@Param("username") String username);
}