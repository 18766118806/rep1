package com.itheima.dao;

import com.itheima.domain.User;

import java.io.Serializable;
import java.util.List;

/*
 * @Author:  Yajun_Xu
 * @Create: 2018/11/22 14:26
 **/
public interface UserDao extends Serializable {
    List<User> selectAll();
}
