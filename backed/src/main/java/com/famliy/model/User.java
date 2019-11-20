package com.famliy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author ajie
 * @Description  用户model
 * @date 2019-11-20 15:45
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)  //json转换时，忽略不存在的属性
@Data
@Builder //Data + Builder会将类的无参构造方法覆盖掉
@Entity
@Table(name = "user")  //指定数据库的表
public class User {

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

    //在类中重写无参构造方法，防止与lombok的注解冲突，在无参构造方法上面加入@Tolerate注解
    @Tolerate
    public User(){

    }
}
