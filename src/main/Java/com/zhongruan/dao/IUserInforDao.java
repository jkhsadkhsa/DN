package com.zhongruan.dao;

import com.zhongruan.bean.UserInfor;

public interface IUserInforDao {

    //登录
    UserInfor doLogin(String username);
}
