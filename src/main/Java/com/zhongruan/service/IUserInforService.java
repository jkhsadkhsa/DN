package com.zhongruan.service;

import com.zhongruan.bean.UserInfor;
import org.springframework.security.core.userdetails.UserDetailsService;

/*
*   用户模块
* */
public interface IUserInforService extends UserDetailsService {

//    登录
    UserInfor doLogin(String username);
}
