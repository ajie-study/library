package com.famliy.mapper;

import com.famliy.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author ajie
 * @Description 
 * @date 2019-11-20 17:16
 *
 */
@Mapper  //使用JPA进行dao层操作
public interface  UserMapper extends JpaRepository<User,Integer> {

    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
